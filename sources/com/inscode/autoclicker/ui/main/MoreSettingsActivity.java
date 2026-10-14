package com.inscode.autoclicker.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.inscode.autoclicker.R;
import com.zipoapps.premiumhelper.ui.settings.PHSettingsActivity;
import fd.j0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class MoreSettingsActivity extends PHSettingsActivity {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(MoreSettingsActivity moreSettingsActivity, View view) {
        j0.i(moreSettingsActivity, "this$0");
        moreSettingsActivity.finish();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
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

    @Override // com.zipoapps.premiumhelper.ui.settings.PHSettingsActivity, androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ImageView) _$_findCachedViewById(R.id.backButton)).setOnClickListener(new y6.d(this));
    }
}
