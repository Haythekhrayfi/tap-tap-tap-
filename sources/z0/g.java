package z0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class g implements TextWatcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f44994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.emoji2.text.e.AbstractC0033e f44996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44997f = true;

    public static class a extends androidx.emoji2.text.e.AbstractC0033e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference<EditText> f44998a;

        public a(EditText editText) {
            this.f44998a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.AbstractC0033e
        public void b() {
            g.a(this.f44998a.get(), 1);
        }
    }

    public g(EditText editText, boolean z10) {
        this.f44994c = editText;
        this.f44995d = z10;
    }

    public static void a(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.a().h(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f44994c.isInEditMode()) {
            return;
        }
        if (!((this.f44997f && (this.f44995d || androidx.emoji2.text.e.c())) ? false : true) && i11 <= i12 && (charSequence instanceof Spannable)) {
            int iB = androidx.emoji2.text.e.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    androidx.emoji2.text.e.a().i((Spannable) charSequence, i10, i10 + i12, Integer.MAX_VALUE, 0);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            androidx.emoji2.text.e eVarA = androidx.emoji2.text.e.a();
            if (this.f44996e == null) {
                this.f44996e = new a(this.f44994c);
            }
            eVarA.j(this.f44996e);
        }
    }
}
