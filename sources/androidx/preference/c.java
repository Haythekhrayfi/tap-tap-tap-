package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class c extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence[] f2326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence[] f2327m;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            c cVar = c.this;
            cVar.f2325k = i10;
            cVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @Override // androidx.preference.f
    public void d(boolean z10) {
        int i10;
        if (!z10 || (i10 = this.f2325k) < 0) {
            return;
        }
        String string = this.f2327m[i10].toString();
        ListPreference listPreference = (ListPreference) b();
        if (listPreference.a(string)) {
            listPreference.L(string);
        }
    }

    @Override // androidx.preference.f
    public void e(androidx.appcompat.app.g.a aVar) {
        aVar.setSingleChoiceItems(this.f2326l, this.f2325k, new a());
        aVar.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.f, androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2325k = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f2326l = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f2327m = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) b();
        if (listPreference.J() == null || listPreference.V == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f2325k = listPreference.I(listPreference.W);
        this.f2326l = listPreference.J();
        this.f2327m = listPreference.V;
    }

    @Override // androidx.preference.f, androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f2325k);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f2326l);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f2327m);
    }
}
