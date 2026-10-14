package nl.psdcompany.duonavigationdrawer.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes3.dex */
public class DuoMenuView extends RelativeLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f33844k = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f33848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DataSetObserver f33849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f33850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LayoutInflater f33851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Adapter f33852j;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e eVar = DuoMenuView.this.f33848f;
            if (eVar != null) {
                eVar.c();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e eVar = DuoMenuView.this.f33848f;
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f33855c;

        public c(int i10) {
            this.f33855c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DuoMenuView duoMenuView = DuoMenuView.this;
            e eVar = duoMenuView.f33848f;
            if (eVar != null) {
                int i10 = this.f33855c;
                eVar.a(i10, duoMenuView.f33852j.getItem(i10));
            }
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LinearLayout f33857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f33858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ViewGroup f33859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ViewGroup f33860d;

        public d(DuoMenuView duoMenuView, ViewGroup viewGroup) {
            this.f33857a = (LinearLayout) viewGroup.findViewById(R.id.duo_view_menu_options_layout);
            this.f33858b = (ImageView) viewGroup.findViewById(R.id.duo_view_menu_background);
            this.f33859c = (ViewGroup) viewGroup.findViewById(R.id.duo_view_menu_header_layout);
            this.f33860d = (ViewGroup) viewGroup.findViewById(R.id.duo_view_menu_footer_layout);
        }
    }

    public interface e {
        void a(int i10, Object obj);

        void b();

        void c();
    }

    public DuoMenuView(Context context) {
        this(context, null);
    }

    public DuoMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DuoMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pd.a.f34637b);
        try {
            this.f33845c = typedArrayObtainStyledAttributes.getResourceId(0, -54321);
            this.f33846d = typedArrayObtainStyledAttributes.getResourceId(2, -54320);
            this.f33847e = typedArrayObtainStyledAttributes.getResourceId(1, -54320);
            typedArrayObtainStyledAttributes.recycle();
            this.f33850h = new d(this, (ViewGroup) RelativeLayout.inflate(getContext(), R.layout.duo_view_menu, this));
            this.f33851i = (LayoutInflater) getContext().getSystemService("layout_inflater");
            this.f33849g = new od.a(this);
            a();
            c();
            b();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getPrimaryColor() {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.colorPrimary});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public final void a() {
        if (this.f33850h.f33858b == null) {
            return;
        }
        if (this.f33845c != -54321) {
            Context context = getContext();
            int i10 = this.f33845c;
            Object obj = e0.a.f28964a;
            Drawable drawableB = e0.a.c.b(context, i10);
            if (drawableB != null) {
                this.f33850h.f33858b.setImageDrawable(drawableB);
                return;
            }
        }
        this.f33850h.f33858b.setBackgroundColor(getPrimaryColor());
    }

    public final void b() {
        int i10 = this.f33847e;
        if (i10 == -54320 || this.f33850h.f33860d == null) {
            return;
        }
        View viewInflate = this.f33851i.inflate(i10, (ViewGroup) null, false);
        if (viewInflate != null) {
            if (this.f33850h.f33860d.getChildCount() > 0) {
                this.f33850h.f33860d.removeAllViews();
            }
            this.f33850h.f33860d.addView(viewInflate);
            viewInflate.setTag("footer");
            viewInflate.bringToFront();
            if (viewInflate instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) viewInflate;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    if (viewGroup.getChildAt(i11) instanceof Button) {
                        viewGroup.getChildAt(i11).setOnClickListener(new b());
                        return;
                    }
                }
            }
        }
    }

    public final void c() {
        View viewInflate;
        int i10 = this.f33846d;
        if (i10 == -54320 || this.f33850h.f33859c == null || (viewInflate = this.f33851i.inflate(i10, (ViewGroup) null, false)) == null) {
            return;
        }
        if (this.f33850h.f33859c.getChildCount() > 0) {
            this.f33850h.f33859c.removeAllViews();
        }
        this.f33850h.f33859c.addView(viewInflate);
        viewInflate.setTag("header");
        viewInflate.bringToFront();
        viewInflate.setOnClickListener(new a());
    }

    public final void d() {
        LinearLayout linearLayout;
        Adapter adapter = this.f33852j;
        if (adapter == null || adapter.isEmpty() || (linearLayout = this.f33850h.f33857a) == null) {
            return;
        }
        if (linearLayout.getChildCount() > 0) {
            this.f33850h.f33857a.removeAllViews();
        }
        for (int i10 = 0; i10 < this.f33852j.getCount(); i10++) {
            View view = this.f33852j.getView(i10, null, this);
            if (view != null) {
                this.f33850h.f33857a.addView(view);
                view.setOnClickListener(new c(i10));
            }
        }
    }

    public Adapter getAdapter() {
        return this.f33852j;
    }

    public View getFooterView() {
        return findViewWithTag("footer");
    }

    public View getHeaderView() {
        return findViewWithTag("header");
    }

    public void setAdapter(Adapter adapter) {
        Adapter adapter2 = this.f33852j;
        if (adapter2 != null) {
            adapter2.unregisterDataSetObserver(this.f33849g);
        }
        this.f33852j = adapter;
        adapter.registerDataSetObserver(this.f33849g);
        d();
    }

    public void setBackground(int i10) {
        this.f33845c = i10;
        a();
    }

    public void setFooterView(int i10) {
        this.f33847e = i10;
        b();
    }

    public void setHeaderView(int i10) {
        this.f33846d = i10;
        c();
    }

    public void setOnMenuClickListener(e eVar) {
        this.f33848f = eVar;
    }
}
