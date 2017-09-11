package com.crimson.markup.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.crimson.markup.R;
import com.crimson.markup.model.ClassObject;

public class ClassListAdapter extends RecyclerView.Adapter<ClassListAdapter.ClassListViewHolder> {

  Context context;
  ClassObject data[] = null;
  ClassSelectionCallback classSelectionCallback;

  public ClassListAdapter(Context context, ClassObject[] data) {
    this.context = context;
    this.data = data;
  }

  public void setClassSelectionCallback(ClassSelectionCallback classSelectionCallback) {
    this.classSelectionCallback = classSelectionCallback;
  }

  @Override public ClassListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return new ClassListViewHolder(LayoutInflater.from(context).inflate(R.layout.class_list_item, parent, false));
  }

  @Override public void onBindViewHolder(ClassListViewHolder holder, int position) {
    ClassObject objectItem = data[position];

    holder.subInfoTextView.setText(objectItem.getSubject() + " - " + objectItem.getSubjectCode());
    holder.classInfoTextView.setText(objectItem.getStream() + " " + objectItem.getBatch() + " (" + objectItem.getStream() + " Semester)");
    holder.sectionInfoTextView.setText("Sec :" + objectItem.getSection() + "  Gr :" + objectItem.Group);
  }

  @Override public int getItemCount() {
    return data == null ? 0 : data.length;
  }

  class ClassListViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.sub_info) TextView subInfoTextView;

    @BindView(R.id.class_info) TextView classInfoTextView;

    @BindView(R.id.section_info) TextView sectionInfoTextView;

    public ClassListViewHolder(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
      itemView.setOnClickListener(view -> classSelectionCallback.classSelected(data[getAdapterPosition()].getBatchID()));
    }
  }

  public interface ClassSelectionCallback {
    void classSelected(String BatchID);
  }
}