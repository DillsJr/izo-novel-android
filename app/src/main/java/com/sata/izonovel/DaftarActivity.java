package com.sata.izonovel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.sata.izonovel.Adapter.DaftarNovelAdapter;
import com.sata.izonovel.Model.InsertNovelModel;
import com.sata.izonovel.Model.ListNovelRequestModel;
import com.sata.izonovel.Model.ListNovelResponseModel;
import com.sata.izonovel.Retrofit.APIService;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class DaftarActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DaftarNovelAdapter daftarNovelAdapter;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        setTitle("Daftar Novel");

        recyclerView = findViewById(R.id.recycle_daftar_novel);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);

        onLoadData();
    }

    private void onLoadData(){
        ListNovelRequestModel listNovelRequestModel=new ListNovelRequestModel();
        listNovelRequestModel.setCollection("novel");
        listNovelRequestModel.setDatabase("izonovel");
        listNovelRequestModel.setDataSource("Cluster0");
        listNovelRequestModel.setFilter("");

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        APIService.endpoint().litDaftarNovel(listNovelRequestModel).enqueue(new Callback<ListNovelResponseModel>() {
            @Override
            public void onResponse(Call<ListNovelResponseModel> call, Response<ListNovelResponseModel> response) {
                List<ListNovelResponseModel.Documents> documents = response.body().getDocuments();

                daftarNovelAdapter = new DaftarNovelAdapter(DaftarActivity.this, documents);
                recyclerView.setAdapter(daftarNovelAdapter);


                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<ListNovelResponseModel> call, Throwable t) {
                progressDialog.dismiss();
            }
        });

    }
}