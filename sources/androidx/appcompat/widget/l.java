package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f1287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0.a f1288b;

    public l(EditText editText) {
        this.f1287a = editText;
        this.f1288b = new z0.a(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? this.f1288b.f44975a.a(keyListener) : keyListener;
    }

    public void b(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f1287a.getContext().obtainStyledAttributes(attributeSet, d.a.f28467i, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        z0.a aVar = this.f1288b;
        Objects.requireNonNull(aVar);
        if (inputConnection == null) {
            return null;
        }
        return aVar.f44975a.c(inputConnection, editorInfo);
    }

    public void d(boolean z10) {
        this.f1288b.f44975a.d(z10);
    }
}
