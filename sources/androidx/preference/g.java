package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inscode.autoclicker.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends Fragment implements k.c, k.a, k.b, DialogPreference.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f2343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f2344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2346g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f2342c = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2347h = R.layout.preference_list_fragment;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f2348i = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f2349j = new b();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            g gVar = g.this;
            PreferenceScreen preferenceScreen = gVar.f2343d.f2382g;
            if (preferenceScreen != null) {
                gVar.f2344e.setAdapter(new h(preferenceScreen));
                preferenceScreen.o();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = g.this.f2344e;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    public class c extends RecyclerView.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f2352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2354c = true;

        public c() {
        }

        public final boolean f(View view, RecyclerView recyclerView) {
            RecyclerView.c0 childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z10 = false;
            if (!((childViewHolder instanceof m) && ((m) childViewHolder).f2394e)) {
                return false;
            }
            boolean z11 = this.f2354c;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z11;
            }
            RecyclerView.c0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
            if ((childViewHolder2 instanceof m) && ((m) childViewHolder2).f2393d) {
                z10 = true;
            }
            return z10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            if (f(view, recyclerView)) {
                rect.bottom = this.f2353b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if (this.f2352a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (f(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f2352a.setBounds(0, height, width, this.f2353b + height);
                    this.f2352a.draw(canvas);
                }
            }
        }
    }

    public interface d {
        boolean a(g gVar, Preference preference);
    }

    public interface e {
        boolean a(g gVar, Preference preference);
    }

    public interface f {
        boolean a(g gVar, PreferenceScreen preferenceScreen);
    }

    @Override // androidx.preference.DialogPreference.a
    public <T extends Preference> T a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        k kVar = this.f2343d;
        if (kVar == null || (preferenceScreen = kVar.f2382g) == null) {
            return null;
        }
        return (T) preferenceScreen.I(charSequence);
    }

    public abstract void b(Bundle bundle, String str);

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i10 = typedValue.resourceId;
        if (i10 == 0) {
            i10 = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i10, false);
        k kVar = new k(requireContext());
        this.f2343d = kVar;
        kVar.f2385j = this;
        b(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, n.f2402h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f2347h = typedArrayObtainStyledAttributes.getResourceId(0, this.f2347h);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f2347h, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            recyclerView.setAccessibilityDelegateCompat(new l(recyclerView));
        }
        this.f2344e = recyclerView;
        recyclerView.addItemDecoration(this.f2342c);
        c cVar = this.f2342c;
        Objects.requireNonNull(cVar);
        cVar.f2353b = drawable != null ? drawable.getIntrinsicHeight() : 0;
        cVar.f2352a = drawable;
        g.this.f2344e.invalidateItemDecorations();
        if (dimensionPixelSize != -1) {
            c cVar2 = this.f2342c;
            cVar2.f2353b = dimensionPixelSize;
            g.this.f2344e.invalidateItemDecorations();
        }
        this.f2342c.f2354c = z10;
        if (this.f2344e.getParent() == null) {
            viewGroup2.addView(this.f2344e);
        }
        this.f2348i.post(this.f2349j);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f2348i.removeCallbacks(this.f2349j);
        this.f2348i.removeMessages(1);
        if (this.f2345f) {
            this.f2344e.setAdapter(null);
            PreferenceScreen preferenceScreen = this.f2343d.f2382g;
            if (preferenceScreen != null) {
                preferenceScreen.s();
            }
        }
        this.f2344e = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = this.f2343d.f2382g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        k kVar = this.f2343d;
        kVar.f2383h = this;
        kVar.f2384i = this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        k kVar = this.f2343d;
        kVar.f2383h = null;
        kVar.f2384i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.f2343d.f2382g) != null) {
            preferenceScreen2.b(bundle2);
        }
        if (this.f2345f && (preferenceScreen = this.f2343d.f2382g) != null) {
            this.f2344e.setAdapter(new h(preferenceScreen));
            preferenceScreen.o();
        }
        this.f2346g = true;
    }
}
