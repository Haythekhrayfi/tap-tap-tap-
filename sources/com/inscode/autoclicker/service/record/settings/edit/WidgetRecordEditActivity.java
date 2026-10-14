package com.inscode.autoclicker.service.record.settings.edit;

import ae.b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseActivity;
import d7.g;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.e;
import jc.f;
import org.joda.time.DateTime;
import vc.b0;
import vc.l;
import yd.h;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetRecordEditActivity extends BaseActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<Integer, View> f13305e = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f13303c = f.b(new a(this, "", null, b.f348c));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nb.a f13304d = new nb.a();

    public static final class a extends l implements uc.a<g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13309f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13306c = componentCallbacks;
            this.f13307d = str;
            this.f13308e = aVar;
            this.f13309f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [d7.g, java.lang.Object] */
        @Override // uc.a
        public final g invoke() {
            return fd.f.d(this.f13306c).f37311a.c(new h(this.f13307d, b0.a(g.class), this.f13308e, this.f13309f));
        }
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        this.f13305e.clear();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this.f13305e;
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
        return R.layout.activity_record_edit;
    }

    @Override // com.inscode.autoclicker.base.BaseActivity, androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v6.a aVar = ((g) this.f13303c.getValue()).f28802c;
        ((TextView) _$_findCachedViewById(R.id.recordEditName)).setText(aVar.getName());
        ((TextView) _$_findCachedViewById(R.id.recordEditDate)).setText(u1.a.f(new DateTime(aVar.h())));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f13304d.d();
    }
}
