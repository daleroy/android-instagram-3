package com.codepath.instagram.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.codepath.instagram.R;
import com.codepath.instagram.adapters.HomeFragmentAdapter;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
//    private InstagramPostsAdapter adapter;
//    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        HomeFragmentAdapter adapterViewPager = new HomeFragmentAdapter(getSupportFragmentManager(), this);
        vpPager.setAdapter(adapterViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tlTabLayout);
        tabLayout.setupWithViewPager(vpPager);
    }
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.mContext = this;
        List<InstagramPost> postList = new ArrayList<InstagramPost>();
        Fresco.initialize(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fetchPosts();

        SimpleVerticalSpacerItemDecoration svsid = new SimpleVerticalSpacerItemDecoration(52);
        // Get RecyclerView Reference
        RecyclerView rvPosts = (RecyclerView) findViewById(R.id.rvPosts);
        rvPosts.addItemDecoration(svsid);
        // Create Adapter
        adapter = new InstagramPostsAdapter(postList);

        // Set Adapter
        rvPosts.setAdapter(adapter);

        // Set Layout
        rvPosts.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void fetchPosts() {
        InstagramClient instagramClient = new InstagramClient(mContext);
        instagramClient.getOwnFeed(new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                if (response != null) {
                    List<InstagramPost> postList = Utils.decodePostsFromJsonResponse(response);
                    adapter.updateList(postList);
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
            }
        });
    }
    */
}

