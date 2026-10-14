package com.zipoapps.premiumhelper.ui.rate;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.p;
import androidx.fragment.app.n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.common.Scopes;
import com.inscode.autoclicker.R;
import com.zipoapps.premiumhelper.ui.rate.RateBarDialog;
import ed.q;
import fd.j0;
import gb.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kc.l;
import kotlin.reflect.KProperty;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class RateBarDialog extends p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f28330s = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.zipoapps.premiumhelper.ui.rate.c.a f28331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f28333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f28334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public za.i.b f28335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f28337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f28338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f28339k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f28340l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f28341m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f28342n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f28343o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f28344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f28345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jc.e f28346r = jc.f.b(h.f28358c);

    public static final class a {

        /* JADX INFO: renamed from: com.zipoapps.premiumhelper.ui.rate.RateBarDialog$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0238a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f28347a;

            static {
                int[] iArr = new int[oa.b.f.values().length];
                try {
                    iArr[oa.b.f.SMILES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f28347a = iArr;
            }
        }

        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public interface b {
        int a(int i10);

        Drawable b(int i10);
    }

    public interface c {
        boolean a(int i10, int i11);
    }

    public interface d {
        void a(int i10);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Drawable f28350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f28351d;

        public e(int i10, int i11, Drawable drawable, boolean z10) {
            this.f28348a = i10;
            this.f28349b = i11;
            this.f28350c = drawable;
            this.f28351d = z10;
        }
    }

    public static final class f extends RecyclerView.g<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f28352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<e> f28353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28354c;

        public final class a extends RecyclerView.c0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ImageView f28355a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f28356b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, View view) {
                super(view);
                j0.i(view, "itemView");
                this.f28356b = fVar;
                View viewFindViewById = view.findViewById(R.id.ivReaction);
                j0.h(viewFindViewById, "itemView.findViewById(R.id.ivReaction)");
                this.f28355a = (ImageView) viewFindViewById;
            }
        }

        public f(d dVar, b bVar) {
            j0.i(dVar, "callback");
            j0.i(bVar, "imageProvider");
            this.f28352a = dVar;
            this.f28353b = new ArrayList(l.c(new e(1, bVar.a(0), bVar.b(0), false), new e(2, bVar.a(1), bVar.b(1), false), new e(3, bVar.a(2), bVar.b(2), false), new e(4, bVar.a(3), bVar.b(3), false), new e(5, bVar.a(4), bVar.b(4), false)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int getItemCount() {
            return this.f28353b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onBindViewHolder(RecyclerView.c0 c0Var, final int i10) {
            a aVar = (a) c0Var;
            j0.i(aVar, "holder");
            e eVar = this.f28353b.get(i10);
            j0.i(eVar, "item");
            aVar.f28355a.setImageResource(eVar.f28349b);
            Drawable drawable = eVar.f28350c;
            if (drawable != null) {
                aVar.f28355a.setBackground(drawable);
            }
            aVar.f28355a.setSelected(eVar.f28351d);
            ImageView imageView = aVar.f28355a;
            final f fVar = aVar.f28356b;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: za.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RateBarDialog.f fVar2 = this.f45217c;
                    int i11 = i10;
                    j0.i(fVar2, "this$0");
                    Objects.requireNonNull(RateBarDialog.f28330s);
                    RateBarDialog.c aVar2 = RateBarDialog.a.C0238a.f28347a[((oa.b.f) ma.h.f33410y.a().f33418g.g(oa.b.f34178j0)).ordinal()] == 1 ? new com.zipoapps.premiumhelper.ui.rate.a() : new com.zipoapps.premiumhelper.ui.rate.b();
                    int size = fVar2.f28353b.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        fVar2.f28353b.get(i12).f28351d = aVar2.a(i12, i11);
                    }
                    fVar2.f28354c = i11;
                    fVar2.notifyDataSetChanged();
                    fVar2.f28352a.a(fVar2.f28353b.get(i11).f28348a);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
            j0.i(viewGroup, "parent");
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view_rate_us_rating, viewGroup, false);
            j0.h(viewInflate, "from(parent.context)\n   …us_rating, parent, false)");
            return new a(this, viewInflate);
        }
    }

    public /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28357a;

        static {
            int[] iArr = new int[oa.b.f.values().length];
            try {
                iArr[oa.b.f.SMILES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f28357a = iArr;
        }
    }

    public static final class h extends vc.l implements uc.a<za.i.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f28358c = new h();

        public h() {
            super(0);
        }

        @Override // uc.a
        public za.i.b invoke() {
            za.i.b.a aVar = new za.i.b.a(null, null, null, null, null, null, 63, null);
            aVar.f45245a = Integer.valueOf(R.color.ph_cta_color);
            aVar.f45246b = Integer.valueOf(R.color.rate_us_cta_btn_disabled);
            aVar.f45247c = Integer.valueOf(R.color.ph_ripple_effect_color);
            aVar.f45250f = Integer.valueOf(R.color.rate_button_text_color);
            return aVar.a();
        }
    }

    public static final class i implements d {
        public i() {
        }

        @Override // com.zipoapps.premiumhelper.ui.rate.RateBarDialog.d
        public void a(int i10) {
            Integer num;
            TextView textView = RateBarDialog.this.f28338j;
            if (textView != null) {
                textView.setVisibility(i10 == 5 ? 0 : 8);
            }
            TextView textView2 = RateBarDialog.this.f28345q;
            if (textView2 != null) {
                textView2.setVisibility(i10 != 5 ? 0 : 8);
            }
            TextView textView3 = RateBarDialog.this.f28338j;
            if (textView3 != null) {
                textView3.setEnabled(i10 == 5);
            }
            RateBarDialog rateBarDialog = RateBarDialog.this;
            boolean z10 = i10 == 5;
            Objects.requireNonNull(rateBarDialog);
            if (z10) {
                TextView textView4 = rateBarDialog.f28338j;
                if (textView4 != null) {
                    Context contextRequireContext = rateBarDialog.requireContext();
                    j0.h(contextRequireContext, "requireContext()");
                    textView4.setBackground(za.f.b(contextRequireContext, rateBarDialog.c(), rateBarDialog.b()));
                }
                za.i.b bVar = rateBarDialog.f28335g;
                if (bVar == null || (num = bVar.f45244f) == null) {
                    return;
                }
                int iIntValue = num.intValue();
                TextView textView5 = rateBarDialog.f28338j;
                if (textView5 != null) {
                    Context contextRequireContext2 = rateBarDialog.requireContext();
                    j0.h(contextRequireContext2, "requireContext()");
                    Object obj = e0.a.f28964a;
                    int iA = e0.a.d.a(contextRequireContext2, iIntValue);
                    textView5.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_enabled}}, new int[]{Color.argb(SyslogConstants.LOG_LOCAL6, Color.red(iA), Color.green(iA), Color.blue(iA)), iA}));
                }
            }
        }
    }

    public final za.i.b b() {
        return (za.i.b) this.f28346r.getValue();
    }

    public final za.i.b c() {
        za.i.b bVar = this.f28335g;
        return bVar == null ? b() : bVar;
    }

    public final void d(String str, int i10) {
        if (this.f28337i) {
            return;
        }
        this.f28337i = true;
        String str2 = this.f28336h;
        String str3 = str2 == null || q.k(str2) ? AppLovinMediationProvider.UNKNOWN : this.f28336h;
        ma.h.a aVar = ma.h.f33410y;
        Bundle bundleA = androidx.activity.i.a(new jc.h("RateGrade", Integer.valueOf(i10)), new jc.h("RateDebug", Boolean.valueOf(aVar.a().k())), new jc.h("RateType", ((oa.b.f) aVar.a().f33418g.g(oa.b.f34178j0)).name()), new jc.h("RateAction", str), new jc.h("RateSource", str3));
        xe.a.b("RateUs").a("Sending event: " + bundleA, new Object[0]);
        com.zipoapps.premiumhelper.a aVar2 = aVar.a().f33419h;
        Objects.requireNonNull(aVar2);
        j0.i(bundleA, "params");
        aVar2.u(aVar2.b("Rate_us_complete", false, bundleA));
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28335g = ma.h.f33410y.a().f33418g.f34205b.getRateBarDialogStyle();
        Bundle arguments = getArguments();
        this.f28333e = arguments != null ? arguments.getString("support_email", null) : null;
        Bundle arguments2 = getArguments();
        this.f28334f = arguments2 != null ? arguments2.getString("support_vip_email", null) : null;
        Bundle arguments3 = getArguments();
        this.f28336h = arguments3 != null ? arguments3.getString("rate_source", null) : null;
        Bundle arguments4 = getArguments();
        if ((arguments4 != null ? arguments4.getInt("theme", -1) : -1) != -1) {
            setStyle(1, getTheme());
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    @Override // androidx.appcompat.app.p, androidx.fragment.app.k
    public Dialog onCreateDialog(Bundle bundle) {
        final boolean z10;
        Integer num;
        Integer num2;
        Integer num3;
        TextView textView;
        final View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.ph_rate_us_stars, (ViewGroup) null);
        j0.h(viewInflate, "from(activity).inflate(R…t.ph_rate_us_stars, null)");
        final RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rvReactions);
        this.f28340l = (TextView) viewInflate.findViewById(R.id.tvTitle);
        this.f28341m = (TextView) viewInflate.findViewById(R.id.tvDescription);
        this.f28338j = (TextView) viewInflate.findViewById(R.id.rate_dialog_positive_button);
        this.f28342n = (TextView) viewInflate.findViewById(R.id.tvHint);
        this.f28345q = (TextView) viewInflate.findViewById(R.id.btnSendFeedback);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.rate_dialog_dismiss_button);
        final int i10 = 0;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: za.a

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ RateBarDialog f45212d;

                {
                    this.f45212d = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            RateBarDialog rateBarDialog = this.f45212d;
                            RateBarDialog.a aVar = RateBarDialog.f28330s;
                            j0.i(rateBarDialog, "this$0");
                            rateBarDialog.dismissAllowingStateLoss();
                            break;
                        default:
                            RateBarDialog rateBarDialog2 = this.f45212d;
                            RateBarDialog.a aVar2 = RateBarDialog.f28330s;
                            j0.i(rateBarDialog2, "this$0");
                            n nVarRequireActivity = rateBarDialog2.requireActivity();
                            j0.h(nVarRequireActivity, "requireActivity()");
                            Bundle arguments = rateBarDialog2.getArguments();
                            c0.z(androidx.activity.i.l(nVarRequireActivity), null, null, new y(arguments != null ? arguments.getBoolean("rate_source", false) : false, nVarRequireActivity, null), 3, null);
                            ma.h.a aVar3 = ma.h.f33410y;
                            aVar3.a().f33417f.n("rate_intent", "positive");
                            rateBarDialog2.d("rate", 5);
                            aVar3.a().f33419h.q();
                            rateBarDialog2.f28332d = true;
                            rateBarDialog2.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
            this.f28343o = imageView;
        }
        String str = this.f28333e;
        final int i11 = 1;
        if (str == null || q.k(str)) {
            z10 = true;
        } else {
            String str2 = this.f28334f;
            if (str2 == null || q.k(str2)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10 && (textView = this.f28345q) != null) {
            textView.setText(getString(R.string.rate_dialog_thanks));
        }
        this.f28339k = viewInflate.findViewById(R.id.main_container);
        this.f28344p = (ImageView) viewInflate.findViewById(R.id.ivArrowHint);
        TextView textView2 = this.f28338j;
        if (textView2 != null) {
            Context contextRequireContext = requireContext();
            j0.h(contextRequireContext, "requireContext()");
            za.i.b bVarC = c();
            j0.i(bVarC, "style");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((int) (8 * Resources.getSystem().getDisplayMetrics().density));
            int i12 = bVarC.f45239a;
            Object obj = e0.a.f28964a;
            gradientDrawable.setColor(e0.a.d.a(contextRequireContext, i12));
            Integer num4 = bVarC.f45240b;
            int iIntValue = num4 != null ? num4.intValue() : R.color.rate_us_cta_btn_disabled;
            Object obj2 = e0.a.f28964a;
            gradientDrawable.setColor(e0.a.d.a(contextRequireContext, iIntValue));
            textView2.setBackground(gradientDrawable);
        }
        TextView textView3 = this.f28345q;
        if (textView3 != null) {
            Context contextRequireContext2 = requireContext();
            j0.h(contextRequireContext2, "requireContext()");
            textView3.setBackground(za.f.b(contextRequireContext2, c(), b()));
        }
        za.i.b bVar = this.f28335g;
        if (bVar != null && (num3 = bVar.f45242d) != null) {
            int iIntValue2 = num3.intValue();
            View view = this.f28339k;
            if (view != null) {
                Context contextRequireContext3 = requireContext();
                Object obj3 = e0.a.f28964a;
                view.setBackgroundColor(e0.a.d.a(contextRequireContext3, iIntValue2));
            }
        }
        za.i.b bVar2 = this.f28335g;
        if (bVar2 != null && (num2 = bVar2.f45244f) != null) {
            int iIntValue3 = num2.intValue();
            TextView textView4 = this.f28345q;
            if (textView4 != null) {
                Context contextRequireContext4 = requireContext();
                j0.h(contextRequireContext4, "requireContext()");
                Object obj4 = e0.a.f28964a;
                int iA = e0.a.d.a(contextRequireContext4, iIntValue3);
                textView4.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_enabled}}, new int[]{Color.argb(SyslogConstants.LOG_LOCAL6, Color.red(iA), Color.green(iA), Color.blue(iA)), iA}));
            }
        }
        za.i.b bVar3 = this.f28335g;
        if (bVar3 != null && (num = bVar3.f45243e) != null) {
            int iIntValue4 = num.intValue();
            Context contextRequireContext5 = requireContext();
            Object obj5 = e0.a.f28964a;
            int iA2 = e0.a.d.a(contextRequireContext5, iIntValue4);
            int iArgb = Color.argb(SyslogConstants.LOG_LOCAL6, Color.red(iA2), Color.green(iA2), Color.blue(iA2));
            TextView textView5 = this.f28340l;
            if (textView5 != null) {
                textView5.setTextColor(iA2);
            }
            TextView textView6 = this.f28341m;
            if (textView6 != null) {
                textView6.setTextColor(iArgb);
            }
            TextView textView7 = this.f28342n;
            if (textView7 != null) {
                textView7.setTextColor(iArgb);
            }
            ImageView imageView2 = this.f28343o;
            if (imageView2 != null) {
                imageView2.setColorFilter(iArgb);
            }
            ImageView imageView3 = this.f28344p;
            if (imageView3 != null) {
                imageView3.setColorFilter(iA2);
            }
        }
        TextView textView8 = this.f28345q;
        if (textView8 != null) {
            textView8.setOnClickListener(new View.OnClickListener() { // from class: za.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z11 = z10;
                    RateBarDialog rateBarDialog = this;
                    View view3 = viewInflate;
                    RecyclerView recyclerView2 = recyclerView;
                    RateBarDialog.a aVar = RateBarDialog.f28330s;
                    j0.i(rateBarDialog, "this$0");
                    j0.i(view3, "$dialogView");
                    if (!z11) {
                        AppCompatActivity appCompatActivity = (AppCompatActivity) rateBarDialog.getContext();
                        if (appCompatActivity == null) {
                            view3.findViewById(R.id.rate_dialog_negative_button).performClick();
                            return;
                        }
                        view3.findViewById(R.id.rate_dialog_negative_button).performClick();
                        String str3 = rateBarDialog.f28333e;
                        j0.f(str3);
                        String str4 = rateBarDialog.f28334f;
                        j0.f(str4);
                        j0.i(appCompatActivity, "activity");
                        j0.i(str3, Scopes.EMAIL);
                        gb.q.c(appCompatActivity, str3, str4);
                        RecyclerView.g adapter = recyclerView2.getAdapter();
                        j0.g(adapter, "null cannot be cast to non-null type com.zipoapps.premiumhelper.ui.rate.RateBarDialog.ReactionsAdapter");
                        int i13 = ((RateBarDialog.f) adapter).f28354c + 1;
                        rateBarDialog.d("rate", i13);
                        if (i13 > 4) {
                            ma.h.a aVar2 = ma.h.f33410y;
                            aVar2.a().f33417f.n("rate_intent", "positive");
                            aVar2.a().f33419h.q();
                        } else {
                            ma.h.f33410y.a().f33417f.n("rate_intent", "negative");
                        }
                    }
                    rateBarDialog.dismissAllowingStateLoss();
                }
            });
        }
        TextView textView9 = this.f28338j;
        if (textView9 != null) {
            textView9.setOnClickListener(new View.OnClickListener(this) { // from class: za.a

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ RateBarDialog f45212d;

                {
                    this.f45212d = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            RateBarDialog rateBarDialog = this.f45212d;
                            RateBarDialog.a aVar = RateBarDialog.f28330s;
                            j0.i(rateBarDialog, "this$0");
                            rateBarDialog.dismissAllowingStateLoss();
                            break;
                        default:
                            RateBarDialog rateBarDialog2 = this.f45212d;
                            RateBarDialog.a aVar2 = RateBarDialog.f28330s;
                            j0.i(rateBarDialog2, "this$0");
                            n nVarRequireActivity = rateBarDialog2.requireActivity();
                            j0.h(nVarRequireActivity, "requireActivity()");
                            Bundle arguments = rateBarDialog2.getArguments();
                            c0.z(androidx.activity.i.l(nVarRequireActivity), null, null, new y(arguments != null ? arguments.getBoolean("rate_source", false) : false, nVarRequireActivity, null), 3, null);
                            ma.h.a aVar3 = ma.h.f33410y;
                            aVar3.a().f33417f.n("rate_intent", "positive");
                            rateBarDialog2.d("rate", 5);
                            aVar3.a().f33419h.q();
                            rateBarDialog2.f28332d = true;
                            rateBarDialog2.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
        }
        TextView textView10 = this.f28340l;
        if (textView10 != null) {
            textView10.setText(getString(R.string.rate_us_title, getString(R.string.app_name)));
        }
        i iVar = new i();
        ma.h.a aVar = ma.h.f33410y;
        f fVar = new f(iVar, g.f28357a[((oa.b.f) aVar.a().f33418g.g(oa.b.f34178j0)).ordinal()] == 1 ? new za.d(this) : new za.e());
        final Context context = getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.zipoapps.premiumhelper.ui.rate.RateBarDialog$onCreateDialog$linearLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        recyclerView.setAdapter(fVar);
        com.zipoapps.premiumhelper.a aVar2 = aVar.a().f33419h;
        KProperty<Object>[] kPropertyArr = com.zipoapps.premiumhelper.a.f28252m;
        aVar2.r(com.zipoapps.premiumhelper.a.b.DIALOG);
        androidx.appcompat.app.g gVarCreate = new androidx.appcompat.app.g.a(requireContext()).setView(viewInflate).create();
        j0.h(gVarCreate, "Builder(requireContext()…View(dialogView).create()");
        Window window = gVarCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return gVarCreate;
    }

    @Override // androidx.fragment.app.k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        j0.i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c enumC0239c = this.f28332d ? com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.DIALOG : com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.NONE;
        com.zipoapps.premiumhelper.ui.rate.c.a aVar = this.f28331c;
        if (aVar != null) {
            aVar.a(enumC0239c, false);
        }
        d("cancel", 0);
    }
}
