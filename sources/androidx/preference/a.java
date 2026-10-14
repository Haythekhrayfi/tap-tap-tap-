package androidx.preference;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EditText f2320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f2321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Runnable f2322m = new RunnableC0039a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f2323n = -1;

    /* JADX INFO: renamed from: androidx.preference.a$a, reason: collision with other inner class name */
    public class RunnableC0039a implements Runnable {
        public RunnableC0039a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.h();
        }
    }

    @Override // androidx.preference.f
    public void c(View view) {
        super.c(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f2320k = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f2320k.setText(this.f2321l);
        EditText editText2 = this.f2320k;
        editText2.setSelection(editText2.getText().length());
        Objects.requireNonNull(g());
    }

    @Override // androidx.preference.f
    public void d(boolean z10) {
        if (z10) {
            String string = this.f2320k.getText().toString();
            EditTextPreference editTextPreferenceG = g();
            Objects.requireNonNull(editTextPreferenceG);
            editTextPreferenceG.I(string);
        }
    }

    @Override // androidx.preference.f
    public void f() {
        i(true);
        h();
    }

    public final EditTextPreference g() {
        return (EditTextPreference) b();
    }

    public void h() {
        long j10 = this.f2323n;
        if (j10 != -1 && j10 + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.f2320k;
            if (editText == null || !editText.isFocused()) {
                i(false);
            } else if (((InputMethodManager) this.f2320k.getContext().getSystemService("input_method")).showSoftInput(this.f2320k, 0)) {
                i(false);
            } else {
                this.f2320k.removeCallbacks(this.f2322m);
                this.f2320k.postDelayed(this.f2322m, 50L);
            }
        }
    }

    public final void i(boolean z10) {
        this.f2323n = z10 ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // androidx.preference.f, androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2321l = bundle == null ? g().U : bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }

    @Override // androidx.preference.f, androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f2321l);
    }
}
