package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public b H;
    public List<Preference> I;
    public PreferenceGroup J;
    public boolean K;
    public d L;
    public e M;
    public final View.OnClickListener N;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f2286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f2289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f2291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f2292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f2294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f2295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Intent f2296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f2297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bundle f2298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2301s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f2302t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f2303u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2304v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2305w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2306x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2307y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2308z;

    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new a();

        public class a implements Parcelable.Creator<BaseSavedState> {
            @Override // android.os.Parcelable.Creator
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public BaseSavedState[] newArray(int i10) {
                return new BaseSavedState[i10];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.x(view);
        }
    }

    public interface b {
    }

    public interface c {
        boolean a(Preference preference);
    }

    public static class d implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Preference f2310c;

        public d(Preference preference) {
            this.f2310c = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence charSequenceJ = this.f2310c.j();
            if (!this.f2310c.D || TextUtils.isEmpty(charSequenceJ)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceJ);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f2310c.f2285c.getSystemService("clipboard");
            CharSequence charSequenceJ = this.f2310c.j();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceJ));
            Context context = this.f2310c.f2285c;
            Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceJ), 0).show();
            return true;
        }
    }

    public interface e<T extends Preference> {
        CharSequence a(T t10);
    }

    public Preference(Context context) {
        this(context, null);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g0.j.a(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0103 A[PHI: r6
  0x0103: PHI (r6v37 int) = (r6v36 int), (r6v49 int) binds: [B:18:0x00f8, B:21:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    public Preference(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2290h = Integer.MAX_VALUE;
        this.f2299q = true;
        this.f2300r = true;
        this.f2301s = true;
        this.f2304v = true;
        this.f2305w = true;
        this.f2306x = true;
        this.f2307y = true;
        this.f2308z = true;
        this.B = true;
        this.E = true;
        this.F = R.layout.preference;
        this.N = new a();
        this.f2285c = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2401g, i10, i11);
        this.f2293k = g0.j.f(typedArrayObtainStyledAttributes, 23, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f2295m = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f2291i = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f2292j = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f2290h = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f2297o = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.F = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.G = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f2299q = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        this.f2300r = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f2301s = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.f2302t = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.f2307y = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, this.f2300r));
        this.f2308z = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, this.f2300r));
        int i12 = 18;
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f2303u = t(typedArrayObtainStyledAttributes, i12);
        } else {
            i12 = 11;
            if (typedArrayObtainStyledAttributes.hasValue(11)) {
                this.f2303u = t(typedArrayObtainStyledAttributes, i12);
            }
        }
        this.E = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.A = zHasValue;
        if (zHasValue) {
            this.B = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.C = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.f2306x = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.D = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void A(int i10) {
        Drawable drawableB = e.a.b(this.f2285c, i10);
        if (this.f2294l != drawableB) {
            this.f2294l = drawableB;
            this.f2293k = 0;
            m();
        }
        this.f2293k = i10;
    }

    public void B(c cVar) {
        this.f2289g = cVar;
    }

    public void C(int i10) {
        if (i10 != this.f2290h) {
            this.f2290h = i10;
            b bVar = this.H;
            if (bVar != null) {
                h hVar = (h) bVar;
                hVar.f2360g.removeCallbacks(hVar.f2361h);
                hVar.f2360g.post(hVar.f2361h);
            }
        }
    }

    public void D(CharSequence charSequence) {
        if (this.M != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f2292j, charSequence)) {
            return;
        }
        this.f2292j = charSequence;
        m();
    }

    public void E(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2291i)) {
            return;
        }
        this.f2291i = charSequence;
        m();
    }

    public final void F(boolean z10) {
        if (this.f2306x != z10) {
            this.f2306x = z10;
            b bVar = this.H;
            if (bVar != null) {
                h hVar = (h) bVar;
                hVar.f2360g.removeCallbacks(hVar.f2361h);
                hVar.f2360g.post(hVar.f2361h);
            }
        }
    }

    public boolean G() {
        return !l();
    }

    public boolean H() {
        return this.f2286d != null && this.f2301s && k();
    }

    public boolean a(Object obj) {
        return true;
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        if (!k() || (parcelable = bundle.getParcelable(this.f2295m)) == null) {
            return;
        }
        this.K = false;
        u(parcelable);
        if (!this.K) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void c(Bundle bundle) {
        if (k()) {
            this.K = false;
            Parcelable parcelableV = v();
            if (!this.K) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableV != null) {
                bundle.putParcelable(this.f2295m, parcelableV);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i10 = this.f2290h;
        int i11 = preference2.f2290h;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f2291i;
        CharSequence charSequence2 = preference2.f2291i;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f2291i.toString());
    }

    public long d() {
        return this.f2287e;
    }

    public boolean e(boolean z10) {
        if (!H()) {
            return z10;
        }
        i();
        return this.f2286d.b().getBoolean(this.f2295m, z10);
    }

    public int f(int i10) {
        if (!H()) {
            return i10;
        }
        i();
        return this.f2286d.b().getInt(this.f2295m, i10);
    }

    public String g(String str) {
        if (!H()) {
            return str;
        }
        i();
        return this.f2286d.b().getString(this.f2295m, str);
    }

    public Set<String> h(Set<String> set) {
        if (!H()) {
            return set;
        }
        i();
        return this.f2286d.b().getStringSet(this.f2295m, set);
    }

    public androidx.preference.e i() {
        k kVar = this.f2286d;
        if (kVar != null) {
            Objects.requireNonNull(kVar);
        }
        return null;
    }

    public CharSequence j() {
        e eVar = this.M;
        return eVar != null ? eVar.a(this) : this.f2292j;
    }

    public boolean k() {
        return !TextUtils.isEmpty(this.f2295m);
    }

    public boolean l() {
        return this.f2299q && this.f2304v && this.f2305w;
    }

    public void m() {
        b bVar = this.H;
        if (bVar != null) {
            h hVar = (h) bVar;
            int iIndexOf = hVar.f2358e.indexOf(this);
            if (iIndexOf != -1) {
                hVar.notifyItemChanged(iIndexOf, this);
            }
        }
    }

    public void n(boolean z10) {
        List<Preference> list = this.I;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Preference preference = list.get(i10);
            if (preference.f2304v == z10) {
                preference.f2304v = !z10;
                preference.n(preference.G());
                preference.m();
            }
        }
    }

    public void o() {
        PreferenceScreen preferenceScreen;
        if (TextUtils.isEmpty(this.f2302t)) {
            return;
        }
        String str = this.f2302t;
        k kVar = this.f2286d;
        Preference preferenceI = null;
        if (kVar != null && (preferenceScreen = kVar.f2382g) != null) {
            preferenceI = preferenceScreen.I(str);
        }
        if (preferenceI == null) {
            StringBuilder sbA = defpackage.a.a("Dependency \"");
            sbA.append(this.f2302t);
            sbA.append("\" not found for preference \"");
            sbA.append(this.f2295m);
            sbA.append("\" (title: \"");
            sbA.append((Object) this.f2291i);
            sbA.append("\"");
            throw new IllegalStateException(sbA.toString());
        }
        if (preferenceI.I == null) {
            preferenceI.I = new ArrayList();
        }
        preferenceI.I.add(this);
        boolean zG = preferenceI.G();
        if (this.f2304v == zG) {
            this.f2304v = !zG;
            n(G());
            m();
        }
    }

    public void p(k kVar) {
        SharedPreferences sharedPreferencesB;
        long j10;
        this.f2286d = kVar;
        if (!this.f2288f) {
            synchronized (kVar) {
                j10 = kVar.f2377b;
                kVar.f2377b = 1 + j10;
            }
            this.f2287e = j10;
        }
        i();
        if (H()) {
            if (this.f2286d != null) {
                i();
                sharedPreferencesB = this.f2286d.b();
            } else {
                sharedPreferencesB = null;
            }
            if (sharedPreferencesB.contains(this.f2295m)) {
                w(null);
                return;
            }
        }
        Object obj = this.f2303u;
        if (obj != null) {
            w(obj);
        }
    }

    public void q(m mVar) {
        Integer numValueOf;
        View view = mVar.itemView;
        view.setOnClickListener(this.N);
        view.setId(0);
        TextView textView = (TextView) mVar.a(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceJ = j();
            if (TextUtils.isEmpty(charSequenceJ)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceJ);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) mVar.a(android.R.id.title);
        if (textView2 != null) {
            CharSequence charSequence = this.f2291i;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.A) {
                    textView2.setSingleLine(this.B);
                }
                if (!this.f2300r && l() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) mVar.a(android.R.id.icon);
        if (imageView != null) {
            int i10 = this.f2293k;
            if (i10 != 0 || this.f2294l != null) {
                if (this.f2294l == null) {
                    this.f2294l = e.a.b(this.f2285c, i10);
                }
                Drawable drawable = this.f2294l;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f2294l != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.C ? 4 : 8);
            }
        }
        View viewA = mVar.a(R.id.icon_frame);
        if (viewA == null) {
            viewA = mVar.a(android.R.id.icon_frame);
        }
        if (viewA != null) {
            if (this.f2294l != null) {
                viewA.setVisibility(0);
            } else {
                viewA.setVisibility(this.C ? 4 : 8);
            }
        }
        z(view, this.E ? l() : true);
        boolean z10 = this.f2300r;
        view.setFocusable(z10);
        view.setClickable(z10);
        mVar.f2393d = this.f2307y;
        mVar.f2394e = this.f2308z;
        boolean z11 = this.D;
        if (z11 && this.L == null) {
            this.L = new d(this);
        }
        view.setOnCreateContextMenuListener(z11 ? this.L : null);
        view.setLongClickable(z11);
        if (!z11 || z10) {
            return;
        }
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.q(view, null);
    }

    public void r() {
    }

    public void s() {
        List<Preference> list;
        PreferenceScreen preferenceScreen;
        String str = this.f2302t;
        if (str != null) {
            k kVar = this.f2286d;
            Preference preferenceI = null;
            if (kVar != null && (preferenceScreen = kVar.f2382g) != null) {
                preferenceI = preferenceScreen.I(str);
            }
            if (preferenceI == null || (list = preferenceI.I) == null) {
                return;
            }
            list.remove(this);
        }
    }

    public Object t(TypedArray typedArray, int i10) {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequence = this.f2291i;
        if (!TextUtils.isEmpty(charSequence)) {
            sb2.append(charSequence);
            sb2.append(' ');
        }
        CharSequence charSequenceJ = j();
        if (!TextUtils.isEmpty(charSequenceJ)) {
            sb2.append(charSequenceJ);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public void u(Parcelable parcelable) {
        this.K = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable v() {
        this.K = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void w(Object obj) {
    }

    public void x(View view) {
        k.c cVar;
        if (l() && this.f2300r) {
            r();
            c cVar2 = this.f2289g;
            if (cVar2 == null || !cVar2.a(this)) {
                k kVar = this.f2286d;
                if (kVar != null && (cVar = kVar.f2383h) != null) {
                    g gVar = (g) cVar;
                    boolean z10 = false;
                    if (this.f2297o != null) {
                        boolean zA = false;
                        for (Fragment parentFragment = gVar; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                            if (parentFragment instanceof g.e) {
                                zA = ((g.e) parentFragment).a(gVar, this);
                            }
                        }
                        if (!zA && (gVar.getContext() instanceof g.e)) {
                            zA = ((g.e) gVar.getContext()).a(gVar, this);
                        }
                        if (!zA && (gVar.getActivity() instanceof g.e)) {
                            zA = ((g.e) gVar.getActivity()).a(gVar, this);
                        }
                        if (!zA) {
                            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                            FragmentManager parentFragmentManager = gVar.getParentFragmentManager();
                            if (this.f2298p == null) {
                                this.f2298p = new Bundle();
                            }
                            Bundle bundle = this.f2298p;
                            Fragment fragmentA = parentFragmentManager.H().a(gVar.requireActivity().getClassLoader(), this.f2297o);
                            fragmentA.setArguments(bundle);
                            fragmentA.setTargetFragment(gVar, 0);
                            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
                            aVar.g(((View) gVar.requireView().getParent()).getId(), fragmentA);
                            if (!aVar.f2012h) {
                                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                            }
                            aVar.f2011g = true;
                            aVar.f2013i = null;
                            aVar.c();
                        }
                        z10 = true;
                    }
                    if (z10) {
                        return;
                    }
                }
                Intent intent = this.f2296n;
                if (intent != null) {
                    this.f2285c.startActivity(intent);
                }
            }
        }
    }

    public boolean y(String str) {
        if (!H()) {
            return false;
        }
        if (TextUtils.equals(str, g(null))) {
            return true;
        }
        i();
        SharedPreferences.Editor editorA = this.f2286d.a();
        editorA.putString(this.f2295m, str);
        if (!this.f2286d.f2380e) {
            editorA.apply();
        }
        return true;
    }

    public final void z(View view, boolean z10) {
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                z(viewGroup.getChildAt(childCount), z10);
            }
        }
    }
}
