package z0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f44983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.emoji2.text.e.AbstractC0033e f44984b;

    public static class a extends androidx.emoji2.text.e.AbstractC0033e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference<TextView> f44985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Reference<d> f44986b;

        public a(TextView textView, d dVar) {
            this.f44985a = new WeakReference(textView);
            this.f44986b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.e.AbstractC0033e
        public void b() {
            CharSequence text;
            CharSequence charSequenceH;
            InputFilter[] filters;
            TextView textView = this.f44985a.get();
            d dVar = this.f44986b.get();
            boolean z10 = false;
            if (dVar != null && textView != null && (filters = textView.getFilters()) != null) {
                for (InputFilter inputFilter : filters) {
                    if (inputFilter == dVar) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10 && textView.isAttachedToWindow() && text != (charSequenceH = androidx.emoji2.text.e.a().h((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceH);
                int selectionEnd = Selection.getSelectionEnd(charSequenceH);
                textView.setText(charSequenceH);
                if (charSequenceH instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequenceH;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f44983a = textView;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f44983a.isInEditMode()) {
            return charSequence;
        }
        int iB = androidx.emoji2.text.e.a().b();
        if (iB != 0) {
            boolean z10 = true;
            if (iB == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f44983a.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                CharSequence charSequence2 = charSequence;
                return androidx.emoji2.text.e.a().i(charSequence2, 0, charSequence2.length(), Integer.MAX_VALUE, 0);
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.e eVarA = androidx.emoji2.text.e.a();
        if (this.f44984b == null) {
            this.f44984b = new a(this.f44983a, this);
        }
        eVarA.j(this.f44984b);
        return charSequence;
    }
}
