package com.crimson.markup.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.crimson.markup.R;
import com.crimson.markup.adapter.ClassListAdapter;
import com.crimson.markup.model.ClassObject;
import com.crimson.markup.model.Register;
import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends BaseActivity {

  @BindView(R.id.toolbar)
  Toolbar toolbar;
  @BindView(R.id.class_recycler_view)
  RecyclerView classRecyclerView;

  RealmResults<Register> allBatch;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    realm = Realm.getDefaultInstance();
    initToolbar();
    initClassList();
  }

  @OnClick(R.id.fab)
  public void addClass(View view) {
    Intent intent = new Intent(MainActivity.this, AddClassActivity.class);
    startActivity(intent);
  }

  private void initClassList() {
    allBatch = realm.where(Register.class).findAll();
    int numBatch = allBatch.size();
    ClassObject[] classObjects = new ClassObject[numBatch];
    int i;
    for (i = 0; i < numBatch; i++)
      classObjects[i] =
          new ClassObject(allBatch.get(i).getBatchID(), allBatch.get(i).getSubject(), allBatch.get(i).getSubjectCode(), allBatch.get(i).getBatch(),
              allBatch.get(i).getSemester(), allBatch.get(i).getStream(), allBatch.get(i).getSection(), allBatch.get(i).getGroup());

    ClassListAdapter classListAdapter = new ClassListAdapter(this, classObjects);
    classListAdapter.setClassSelectionCallback(this::goToSelectedClass);
    classRecyclerView.setAdapter(classListAdapter);
  }

  private void goToSelectedClass(String batchID) {

  }

  private void initToolbar() {
    setSupportActionBar(toolbar);
    getSupportActionBar().setHomeButtonEnabled(false);
    getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    getSupportActionBar().setTitle("Class");
  }
}
