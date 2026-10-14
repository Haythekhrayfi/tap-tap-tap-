package com.inscode.autoclicker.service;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.b.z;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseActivity;
import com.inscode.autoclicker.base.BaseAdapter;
import ed.u;
import fd.j0;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jc.w;
import kc.t;
import org.joda.time.DateTime;
import r6.o;
import uc.p;
import vc.b0;
import y6.a1;
import y6.a2;
import y6.b2;
import y6.c2;
import y6.d2;
import y6.g2;
import y6.h2;
import y6.i2;
import y6.l0;
import y6.s;
import y6.w1;
import y6.y1;
import y6.z1;

/* JADX INFO: loaded from: classes2.dex */
public final class RecordSettingsLoadActivity extends BaseActivity {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f13175l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f13176m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jc.e f13177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v6.a f13178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BaseAdapter<v6.a> f13180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jc.e f13181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nb.a f13182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jc.e f13183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<v6.a> f13184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map<Integer, View> f13185k = new LinkedHashMap();

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b extends vc.l implements uc.l<List<? extends v6.a>, w> {
        public b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // uc.l
        public w invoke(List<? extends v6.a> list) {
            List<? extends v6.a> list2 = list;
            RecordSettingsLoadActivity recordSettingsLoadActivity = RecordSettingsLoadActivity.this;
            j0.h(list2, "it");
            recordSettingsLoadActivity.f13184j = list2;
            return w.f31842a;
        }
    }

    public static final class c extends vc.l implements uc.l<List<? extends v6.a>, List<? extends v6.a>> {
        public c() {
            super(1);
        }

        @Override // uc.l
        public List<? extends v6.a> invoke(List<? extends v6.a> list) {
            List<? extends v6.a> list2 = list;
            j0.i(list2, "it");
            RecordSettingsLoadActivity recordSettingsLoadActivity = RecordSettingsLoadActivity.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (u.x(((v6.a) obj).getName(), recordSettingsLoadActivity.f13179e, false, 2)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    public static final class d extends vc.l implements uc.l<List<? extends v6.a>, List<? extends v6.a>> {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f13189a;

            static {
                int[] iArr = new int[o.values().length];
                try {
                    iArr[o.ASC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o.DESC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f13189a = iArr;
            }
        }

        public d() {
            super(1);
        }

        @Override // uc.l
        public List<? extends v6.a> invoke(List<? extends v6.a> list) {
            Comparator y1Var;
            List<? extends v6.a> list2 = list;
            j0.i(list2, "it");
            RecordSettingsLoadActivity recordSettingsLoadActivity = RecordSettingsLoadActivity.this;
            int i10 = RecordSettingsLoadActivity.f13175l;
            int i11 = a.f13189a[recordSettingsLoadActivity.getAppSettings().k().ordinal()];
            if (i11 == 1) {
                y1Var = RecordSettingsLoadActivity.this.getAppSettings().j() == r6.n.UPDATE_DATE ? new y1() : new z1();
            } else {
                if (i11 != 2) {
                    throw new jc.g();
                }
                y1Var = RecordSettingsLoadActivity.this.getAppSettings().j() == r6.n.UPDATE_DATE ? new a2() : new b2();
            }
            return t.C(list2, y1Var);
        }
    }

    public static final class e extends vc.l implements uc.l<Throwable, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f13190c = new e();

        public e() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "it", "[RECORD_SETTINGS] [ERROR] (loadSettings) ", th2, ' ')), new Object[0]);
            return w.f31842a;
        }
    }

    public static final class f extends vc.l implements uc.l<List<? extends v6.a>, w> {
        public f() {
            super(1);
        }

        @Override // uc.l
        public w invoke(List<? extends v6.a> list) {
            List<? extends v6.a> list2 = list;
            RecordSettingsLoadActivity recordSettingsLoadActivity = RecordSettingsLoadActivity.this;
            j0.h(list2, "it");
            int i10 = RecordSettingsLoadActivity.f13175l;
            ((RecyclerView) recordSettingsLoadActivity._$_findCachedViewById(R.id.loadSettingsList)).setLayoutManager(new LinearLayoutManager(recordSettingsLoadActivity));
            ((RecyclerView) recordSettingsLoadActivity._$_findCachedViewById(R.id.loadSettingsList)).setAdapter(recordSettingsLoadActivity.f13180f);
            recordSettingsLoadActivity.f13180f.setAll(list2);
            return w.f31842a;
        }
    }

    public static final class g extends vc.l implements p<View, v6.a, w> {
        public g() {
            super(2);
        }

        @Override // uc.p
        public w invoke(View view, v6.a aVar) {
            View view2 = view;
            v6.a aVar2 = aVar;
            j0.i(view2, "itemView");
            j0.i(aVar2, "item");
            ((TextView) view2.findViewById(R.id.itemSettingsName)).setText(aVar2.getName());
            ((TextView) view2.findViewById(R.id.itemSettingsDate)).setText(u1.a.f(new DateTime(aVar2.h())));
            ((ImageView) view2.findViewById(R.id.itemSettingsDelete)).setOnClickListener(new a1(RecordSettingsLoadActivity.this, view2, aVar2));
            return w.f31842a;
        }
    }

    public static final class h extends vc.l implements uc.l<v6.a, w> {
        public h() {
            super(1);
        }

        @Override // uc.l
        public w invoke(v6.a aVar) {
            v6.a aVar2 = aVar;
            j0.i(aVar2, "it");
            if (aVar2.b().isEmpty()) {
                u1.a.s(RecordSettingsLoadActivity.this, R.string.recording_no_actions, 0, 2);
            } else {
                RecordSettingsLoadActivity recordSettingsLoadActivity = RecordSettingsLoadActivity.this;
                int i10 = RecordSettingsLoadActivity.f13175l;
                recordSettingsLoadActivity.i().c(aVar2);
                RecordSettingsLoadActivity.this.finish();
            }
            return w.f31842a;
        }
    }

    public static final class i extends vc.l implements uc.l<Throwable, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f13194c = new i();

        public i() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Throwable th) {
            j0.i(th, "it");
            return w.f31842a;
        }
    }

    public static final class j extends vc.l implements uc.l<Boolean, w> {
        public j() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Boolean bool) {
            Boolean bool2 = bool;
            j0.h(bool2, "granted");
            if (bool2.booleanValue()) {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType("*/*");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                ma.h.f33410y.a().j();
                RecordSettingsLoadActivity.this.startActivityForResult(intent, RecordSettingsLoadActivity.f13175l);
            }
            return w.f31842a;
        }
    }

    public static final class k extends vc.l implements uc.a<s> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13199f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13196c = componentCallbacks;
            this.f13197d = str;
            this.f13198e = aVar;
            this.f13199f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, y6.s] */
        @Override // uc.a
        public final s invoke() {
            return fd.f.d(this.f13196c).f37311a.c(new yd.h(this.f13197d, b0.a(s.class), this.f13198e, this.f13199f));
        }
    }

    public static final class l extends vc.l implements uc.a<r6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13203f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13200c = componentCallbacks;
            this.f13201d = str;
            this.f13202e = aVar;
            this.f13203f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r6.e] */
        @Override // uc.a
        public final r6.e invoke() {
            return fd.f.d(this.f13200c).f37311a.c(new yd.h(this.f13201d, b0.a(r6.e.class), this.f13202e, this.f13203f));
        }
    }

    public static final class m extends vc.l implements uc.a<d7.g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13207f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13204c = componentCallbacks;
            this.f13205d = str;
            this.f13206e = aVar;
            this.f13207f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [d7.g, java.lang.Object] */
        @Override // uc.a
        public final d7.g invoke() {
            return fd.f.d(this.f13204c).f37311a.c(new yd.h(this.f13205d, b0.a(d7.g.class), this.f13206e, this.f13207f));
        }
    }

    public static final class n implements TextWatcher {
        public n() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strValueOf = String.valueOf(editable);
            if (j0.d(strValueOf, RecordSettingsLoadActivity.this.f13179e)) {
                return;
            }
            RecordSettingsLoadActivity recordSettingsLoadActivity = RecordSettingsLoadActivity.this;
            recordSettingsLoadActivity.f13179e = strValueOf;
            recordSettingsLoadActivity.j(false);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static {
        new a(null);
        f13175l = 1;
        f13176m = 2;
    }

    public RecordSettingsLoadActivity() {
        ae.b bVar = ae.b.f348c;
        this.f13177c = jc.f.b(new k(this, "", null, bVar));
        this.f13179e = "";
        this.f13180f = new BaseAdapter.Builder().layoutId(R.layout.item_settings).onBind(new g()).onItemClick(new h()).build();
        this.f13181g = jc.f.b(new l(this, "", null, bVar));
        this.f13182h = new nb.a();
        this.f13183i = jc.f.b(new m(this, "", null, bVar));
        this.f13184j = kc.w.f32009c;
    }

    public static void g(RecordSettingsLoadActivity recordSettingsLoadActivity, View view) {
        j0.i(recordSettingsLoadActivity, "this$0");
        super.onBackPressed();
    }

    public static final void h(RecordSettingsLoadActivity recordSettingsLoadActivity, String str) {
        Objects.requireNonNull(recordSettingsLoadActivity);
        u1.a.t(recordSettingsLoadActivity, str, 0, 2);
    }

    public static /* synthetic */ void k(RecordSettingsLoadActivity recordSettingsLoadActivity, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        recordSettingsLoadActivity.j(z10);
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        this.f13185k.clear();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this.f13185k;
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

    public final r6.e getAppSettings() {
        return (r6.e) this.f13181g.getValue();
    }

    public final d7.g i() {
        return (d7.g) this.f13183i.getValue();
    }

    public final void j(boolean z10) {
        nb.b bVarC = ec.a.c(new wb.a(new l0(z10, this)).j(z.C).h(new p6.a(new c(), 19)).h(new p6.a(new d(), 20)).n(fc.a.f29534b).i(mb.a.a()), e.f13190c, new f());
        p6.b.a(bVarC, "$receiver", this.f13182h, "compositeDisposable", bVarC);
    }

    public final void l() {
        nb.b bVarE = ec.a.e(lb.i.n(Boolean.TRUE).p(mb.a.a()), i.f13194c, null, new j(), 2);
        nb.a aVar = this.f13182h;
        j0.j(aVar, "compositeDisposable");
        aVar.a(bVarE);
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public int layoutId() {
        return R.layout.activity_record_load_settings;
    }

    public final boolean m() {
        if (ma.h.f33410y.a().i()) {
            return true;
        }
        u1.a.o(this, R.string.import_export_pro, -2).setAction(getString(R.string.buy_pro), new w1(this, 5)).show();
        return false;
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == -1) {
            if (i10 == f13175l) {
                List<File> listC = defpackage.b.c(intent, this);
                if (listC != null) {
                    nb.b bVarC = ec.a.c(lb.i.l(listC).k(new p6.a(new g2(this), 18)).y().n(fc.a.f29534b).i(mb.a.a()), h2.f38205c, new i2(this));
                    p6.b.a(bVarC, "$receiver", this.f13182h, "compositeDisposable", bVarC);
                    return;
                }
                return;
            }
            if (i10 == f13176m) {
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || this.f13178d == null) {
                    return;
                }
                s sVar = (s) this.f13177c.getValue();
                v6.a aVar = this.f13178d;
                j0.f(aVar);
                v6.a aVar2 = this.f13178d;
                j0.f(aVar2);
                nb.b bVarC2 = ec.a.c(sVar.b(this, data, aVar, aVar2.getName(), "record").n(fc.a.f29534b).i(mb.a.a()), new c2(this), new d2(this));
                p6.b.a(bVarC2, "$receiver", this.f13182h, "compositeDisposable", bVarC2);
            }
        }
    }

    @Override // com.inscode.autoclicker.base.BaseActivity, androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j(false);
        ((Button) _$_findCachedViewById(R.id.loadSettingsImport)).setOnClickListener(new w1(this, 0));
        updateUi();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f13182h.d();
    }

    public final void updateUi() {
        ((ImageView) _$_findCachedViewById(R.id.backButton)).setOnClickListener(new w1(this, 1));
        ((ImageView) _$_findCachedViewById(R.id.resetSearchQueryButton)).setOnClickListener(new w1(this, 2));
        ((ImageView) _$_findCachedViewById(R.id.sortingByButton)).setOnClickListener(new w1(this, 3));
        ((ImageView) _$_findCachedViewById(R.id.sortingOrderButton)).setOnClickListener(new w1(this, 4));
        EditText editText = (EditText) _$_findCachedViewById(R.id.searchField);
        j0.h(editText, "searchField");
        editText.addTextChangedListener(new n());
    }
}
