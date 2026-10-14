package com.inscode.autoclicker.service.manual.settings;

import a3.i;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.c;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseActivity;
import g3.k;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetOneFingerVideoActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<Integer, View> f13282c = new LinkedHashMap();

    @Override // com.inscode.autoclicker.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        this.f13282c.clear();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this.f13282c;
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
        return R.layout.activity_one_finger;
    }

    @Override // com.inscode.autoclicker.base.BaseActivity, androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVar = new c(this);
        cVar.b(5.0f);
        cVar.f2900c.f2921q = 30.0f;
        cVar.invalidateSelf();
        cVar.start();
        i iVarI = a3.c.b(this).f18h.b(this).j("https://i.imgur.com/V8lVPIX.gif").e(k.f29859a).i(cVar);
        Map<Integer, View> map = this.f13282c;
        View viewFindViewById = map.get(Integer.valueOf(R.id.oneFingerImage));
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(R.id.oneFingerImage);
            if (viewFindViewById != null) {
                map.put(Integer.valueOf(R.id.oneFingerImage), viewFindViewById);
            } else {
                viewFindViewById = null;
            }
        }
        iVarI.u((ImageView) viewFindViewById);
    }
}
