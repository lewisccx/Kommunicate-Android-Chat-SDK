package com.applozic.mobicomkit.uiwidgets.conversation.richmessaging.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.applozic.mobicomkit.uiwidgets.AlCustomizationSettings;
import com.applozic.mobicomkit.uiwidgets.R;
import com.applozic.mobicomkit.uiwidgets.conversation.richmessaging.AlRichMessage;
import com.applozic.mobicomkit.uiwidgets.conversation.richmessaging.callbacks.ALRichMessageListener;
import com.applozic.mobicomkit.uiwidgets.conversation.richmessaging.models.ALRichMessageModel;
import com.applozic.mobicommons.json.GsonUtils;

import java.util.Arrays;
import java.util.List;

public class KmFormItemAdapter extends RecyclerView.Adapter {

    private Context context;
    private ALRichMessageModel alRichMessageModel;
    private ALRichMessageListener alRichMessageListener;
    private AlCustomizationSettings alCustomizationSettings;
    private List<ALRichMessageModel.ALPayloadModel> payloadList;
    public static final String FORM_ITEM_TYPE_TEXT_FIELD = "text";
    public static final String FORM_ITEM_TYPE_HIDDEN = "hidden";

    private static final int VIEW_TYPE_TEXT_FIELD = 1;
    private static final int VIEW_TYPE_OTHER = 2;

    public KmFormItemAdapter(Context context, ALRichMessageModel alRichMessageModel, ALRichMessageListener richMessageListener, AlCustomizationSettings alCustomizationSettings) {
        this.alRichMessageModel = alRichMessageModel;
        this.alRichMessageListener = richMessageListener;
        this.alCustomizationSettings = alCustomizationSettings;
        this.context = context;

        payloadList = Arrays.asList((ALRichMessageModel.ALPayloadModel[])
                GsonUtils.getObjectFromJson(alRichMessageModel.getPayload(), ALRichMessageModel.ALPayloadModel[].class));
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (viewType == VIEW_TYPE_TEXT_FIELD) {
            View itemView = LayoutInflater.from(context).inflate(R.layout.km_form_item_layout, parent, false);
            return new KmFormItemViewHolder(itemView);
        }

        return new KmFormItemViewHolder(new View(context));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (payloadList != null && !payloadList.isEmpty()) {
            ALRichMessageModel.ALPayloadModel payloadModel = payloadList.get(position);

            if (payloadModel != null) {
                if (!isTypeTextField(payloadModel.getType())) {
                    return;
                }

                final KmFormItemViewHolder formItemViewHolder = (KmFormItemViewHolder) holder;

                formItemViewHolder.formItemLayout.setVisibility(!isTypeTextField(payloadModel.getType()) ? View.GONE : View.VISIBLE);

                if (FORM_ITEM_TYPE_TEXT_FIELD.equals(payloadModel.getType())) {
                    formItemViewHolder.formLabel.setVisibility(!TextUtils.isEmpty(payloadModel.getLabel()) ? View.VISIBLE : View.GONE);
                    formItemViewHolder.formLabel.setText(payloadModel.getLabel());
                    formItemViewHolder.formEditText.setVisibility(View.VISIBLE);
                    formItemViewHolder.formEditText.setHint(TextUtils.isEmpty(payloadModel.getPlaceholder()) ? "" : payloadModel.getPlaceholder());
                } else if (AlRichMessage.SUBMIT_BUTTON.equals(payloadModel.getType())) {

                }
            }
        }
    }

    @Override
    public int getItemCount() {
        return payloadList != null ? payloadList.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return payloadList != null && FORM_ITEM_TYPE_TEXT_FIELD.equals(payloadList.get(position).getType()) ? VIEW_TYPE_TEXT_FIELD : VIEW_TYPE_OTHER;
    }

    public boolean isTypeTextField(String type) {
        return !(FORM_ITEM_TYPE_HIDDEN.equals(type) || AlRichMessage.SUBMIT_BUTTON.equals(type));
    }

    public class KmFormItemViewHolder extends RecyclerView.ViewHolder {

        TextView formLabel;
        EditText formEditText;
        LinearLayout formItemLayout;

        public KmFormItemViewHolder(@NonNull View itemView) {
            super(itemView);

            formLabel = itemView.findViewById(R.id.kmFormLabel);
            formEditText = itemView.findViewById(R.id.kmFormEditText);
            formItemLayout = itemView.findViewById(R.id.kmFormItemLayout);
        }
    }
}
