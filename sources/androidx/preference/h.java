package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class h extends RecyclerView.g<m> implements Preference.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PreferenceGroup f2356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<Preference> f2357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<Preference> f2358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<b> f2359f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f2361h = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f2360g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.i();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f2365c;

        public b(Preference preference) {
            this.f2365c = preference.getClass().getName();
            this.f2363a = preference.F;
            this.f2364b = preference.G;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2363a == bVar.f2363a && this.f2364b == bVar.f2364b && TextUtils.equals(this.f2365c, bVar.f2365c);
        }

        public int hashCode() {
            return this.f2365c.hashCode() + ((((527 + this.f2363a) * 31) + this.f2364b) * 31);
        }
    }

    public h(PreferenceGroup preferenceGroup) {
        this.f2356c = preferenceGroup;
        preferenceGroup.H = this;
        this.f2357d = new ArrayList();
        this.f2358e = new ArrayList();
        this.f2359f = new ArrayList();
        setHasStableIds(preferenceGroup instanceof PreferenceScreen ? ((PreferenceScreen) preferenceGroup).U : true);
        i();
    }

    public final List<Preference> c(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iK = preferenceGroup.K();
        int i10 = 0;
        for (int i11 = 0; i11 < iK; i11++) {
            Preference preferenceJ = preferenceGroup.J(i11);
            if (preferenceJ.f2306x) {
                if (!h(preferenceGroup) || i10 < preferenceGroup.T) {
                    arrayList.add(preferenceJ);
                } else {
                    arrayList2.add(preferenceJ);
                }
                if (preferenceJ instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceJ;
                    if (!(!(preferenceGroup2 instanceof PreferenceScreen))) {
                        continue;
                    } else {
                        if (h(preferenceGroup) && h(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : (ArrayList) c(preferenceGroup2)) {
                            if (!h(preferenceGroup) || i10 < preferenceGroup.T) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i10++;
                        }
                    }
                } else {
                    i10++;
                }
            }
        }
        if (h(preferenceGroup) && i10 > preferenceGroup.T) {
            androidx.preference.b bVar = new androidx.preference.b(preferenceGroup.f2285c, arrayList2, preferenceGroup.f2287e);
            bVar.f2289g = new i(this, preferenceGroup);
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public final void e(List<Preference> list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.P);
        }
        int iK = preferenceGroup.K();
        for (int i10 = 0; i10 < iK; i10++) {
            Preference preferenceJ = preferenceGroup.J(i10);
            list.add(preferenceJ);
            b bVar = new b(preferenceJ);
            if (!this.f2359f.contains(bVar)) {
                this.f2359f.add(bVar);
            }
            if (preferenceJ instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceJ;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    e(list, preferenceGroup2);
                }
            }
            preferenceJ.H = this;
        }
    }

    public Preference f(int i10) {
        if (i10 < 0 || i10 >= getItemCount()) {
            return null;
        }
        return this.f2358e.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return this.f2358e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long getItemId(int i10) {
        if (hasStableIds()) {
            return f(i10).d();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int i10) {
        b bVar = new b(f(i10));
        int iIndexOf = this.f2359f.indexOf(bVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = this.f2359f.size();
        this.f2359f.add(bVar);
        return size;
    }

    public final boolean h(PreferenceGroup preferenceGroup) {
        return preferenceGroup.T != Integer.MAX_VALUE;
    }

    public void i() {
        Iterator<Preference> it = this.f2357d.iterator();
        while (it.hasNext()) {
            it.next().H = null;
        }
        ArrayList arrayList = new ArrayList(this.f2357d.size());
        this.f2357d = arrayList;
        e(arrayList, this.f2356c);
        this.f2358e = c(this.f2356c);
        k kVar = this.f2356c.f2286d;
        notifyDataSetChanged();
        Iterator<Preference> it2 = this.f2357d.iterator();
        while (it2.hasNext()) {
            Objects.requireNonNull(it2.next());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
        m mVar = (m) c0Var;
        Preference preferenceF = f(i10);
        Drawable background = mVar.itemView.getBackground();
        Drawable drawable = mVar.f2390a;
        if (background != drawable) {
            View view = mVar.itemView;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.q(view, drawable);
        }
        TextView textView = (TextView) mVar.a(R.id.title);
        if (textView != null && mVar.f2391b != null && !textView.getTextColors().equals(mVar.f2391b)) {
            textView.setTextColor(mVar.f2391b);
        }
        preferenceF.q(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        b bVar = this.f2359f.get(i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, n.f2395a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = e.a.b(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(bVar.f2363a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.q(viewInflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i11 = bVar.f2364b;
            if (i11 != 0) {
                layoutInflaterFrom.inflate(i11, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new m(viewInflate);
    }
}
