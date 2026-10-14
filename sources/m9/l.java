package m9;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.h0;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.List;
import java.util.Objects;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public class l extends o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f33374t = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public uc.l<? super Integer, w> f33375r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @SuppressLint({"RestrictedApi"})
    public final a f33376s;

    public static class a extends h0 {
        public final Context D;
        public final C0359a E;

        /* JADX INFO: renamed from: m9.l$a$a, reason: collision with other inner class name */
        public final class C0359a extends BaseAdapter {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public List<String> f33377c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f33378d;

            public C0359a(a aVar) {
                j0.i(aVar, "this$0");
                this.f33378d = aVar;
                this.f33377c = kc.w.f32009c;
            }

            @Override // android.widget.Adapter
            public int getCount() {
                return this.f33377c.size();
            }

            @Override // android.widget.Adapter
            public Object getItem(int i10) {
                return this.f33377c.get(i10);
            }

            @Override // android.widget.Adapter
            public long getItemId(int i10) {
                return i10;
            }

            @Override // android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                Object obj = view;
                if (view == null) {
                    TextView textView = new TextView(this.f33378d.D, null, R.attr.spinnerDropDownItemStyle);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setSingleLine(true);
                    textView.setLayoutParams(new ViewGroup.LayoutParams(-1, k9.i.b(48)));
                    obj = textView;
                }
                TextView textView2 = (TextView) obj;
                textView2.setText(this.f33377c.get(i10));
                return textView2;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            this(context, null, 0, 6, null);
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0, 4, null);
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            this.D = context;
            this.E = new C0359a(this);
        }

        public /* synthetic */ a(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
            this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? com.inscode.autoclicker.R.attr.listPopupWindowStyle : i10);
        }

        @Override // androidx.appcompat.widget.h0, j.f
        public void show() {
            if (this.f1235e == null) {
                super.show();
            }
            super.show();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        AttributeSet attributeSet = null;
        int i10 = 0;
        int i11 = 6;
        vc.g gVar = null;
        super(context, attributeSet, i10, i11, gVar);
        setOnClickListener(new y6.d(this));
        final a aVar = new a(context, attributeSet, i10, i11, gVar);
        aVar.q(true);
        aVar.f1247q = this;
        aVar.f1248r = new AdapterView.OnItemClickListener() { // from class: m9.k
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i12, long j10) {
                l lVar = this.f33372c;
                l.a aVar2 = aVar;
                j0.i(lVar, "this$0");
                j0.i(aVar2, "$this_apply");
                uc.l<? super Integer, w> lVar2 = lVar.f33375r;
                if (lVar2 != null) {
                    lVar2.invoke(Integer.valueOf(i12));
                }
                aVar2.dismiss();
            }
        };
        aVar.f1243m = true;
        aVar.f1242l = true;
        aVar.A.setBackgroundDrawable(new ColorDrawable(-1));
        aVar.n(aVar.E);
        this.f33376s = aVar;
    }

    public final uc.l<Integer, w> getOnItemSelectedListener() {
        return this.f33375r;
    }

    @Override // m9.f, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f33376s.a()) {
            this.f33376s.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.f33376s.a()) {
            this.f33376s.show();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i10) {
        j0.i(view, "changedView");
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 || !this.f33376s.a()) {
            return;
        }
        this.f33376s.dismiss();
    }

    public final void setItems(List<String> list) {
        j0.i(list, "items");
        a.C0359a c0359a = this.f33376s.E;
        Objects.requireNonNull(c0359a);
        c0359a.f33377c = list;
        c0359a.notifyDataSetChanged();
    }

    public final void setOnItemSelectedListener(uc.l<? super Integer, w> lVar) {
        this.f33375r = lVar;
    }
}
