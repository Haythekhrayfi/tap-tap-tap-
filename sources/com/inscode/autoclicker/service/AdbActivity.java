package com.inscode.autoclicker.service;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import y6.d;

/* JADX INFO: loaded from: classes2.dex */
public final class AdbActivity extends BaseActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f13097d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<Integer, View> f13098c = new LinkedHashMap();

    @Override // com.inscode.autoclicker.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        this.f13098c.clear();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this.f13098c;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public int layoutId() {
        return R.layout.activity_adb;
    }

    @Override // com.inscode.autoclicker.base.BaseActivity, androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT == 29) {
            ((LinearLayout) _$_findCachedViewById(R.id.adbInstructionsAndroid10)).setVisibility(0);
            ((LinearLayout) _$_findCachedViewById(R.id.adbInstructionsAndroid9)).setVisibility(8);
            ((LinearLayout) _$_findCachedViewById(R.id.adbInstructions2Android10)).setVisibility(0);
            ((LinearLayout) _$_findCachedViewById(R.id.adbInstructions2Android9)).setVisibility(8);
        } else {
            ((LinearLayout) _$_findCachedViewById(R.id.adbInstructionsAndroid10)).setVisibility(8);
            ((LinearLayout) _$_findCachedViewById(R.id.adbInstructionsAndroid9)).setVisibility(0);
            ((LinearLayout) _$_findCachedViewById(R.id.adbInstructions2Android10)).setVisibility(8);
            ((LinearLayout) _$_findCachedViewById(R.id.adbInstructions2Android9)).setVisibility(0);
        }
        ((Button) _$_findCachedViewById(R.id.adbRestartButton)).setOnClickListener(new d(this));
    }
}
