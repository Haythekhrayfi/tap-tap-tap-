package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set<String> f2329k = new HashSet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence[] f2331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence[] f2332n;

    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i10, boolean z10) {
            boolean z11;
            boolean zRemove;
            d dVar = d.this;
            if (z10) {
                z11 = dVar.f2330l;
                zRemove = dVar.f2329k.add(dVar.f2332n[i10].toString());
            } else {
                z11 = dVar.f2330l;
                zRemove = dVar.f2329k.remove(dVar.f2332n[i10].toString());
            }
            dVar.f2330l = zRemove | z11;
        }
    }

    @Override // androidx.preference.f
    public void d(boolean z10) {
        if (z10 && this.f2330l) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) b();
            Objects.requireNonNull(multiSelectListPreference);
            multiSelectListPreference.I(this.f2329k);
        }
        this.f2330l = false;
    }

    @Override // androidx.preference.f
    public void e(androidx.appcompat.app.g.a aVar) {
        int length = this.f2332n.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = this.f2329k.contains(this.f2332n[i10].toString());
        }
        aVar.setMultiChoiceItems(this.f2331m, zArr, new a());
    }

    @Override // androidx.preference.f, androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2329k.clear();
            this.f2329k.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f2330l = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f2331m = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f2332n = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) b();
        if (multiSelectListPreference.U == null || multiSelectListPreference.V == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f2329k.clear();
        this.f2329k.addAll(multiSelectListPreference.W);
        this.f2330l = false;
        this.f2331m = multiSelectListPreference.U;
        this.f2332n = multiSelectListPreference.V;
    }

    @Override // androidx.preference.f, androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f2329k));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f2330l);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f2331m);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f2332n);
    }
}
