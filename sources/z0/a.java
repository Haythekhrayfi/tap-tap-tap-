package z0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.activity.i;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f44975a;

    /* JADX INFO: renamed from: z0.a$a, reason: collision with other inner class name */
    public static class C0482a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f44976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f44977b;

        public C0482a(EditText editText, boolean z10) {
            this.f44976a = editText;
            g gVar = new g(editText, z10);
            this.f44977b = gVar;
            editText.addTextChangedListener(gVar);
            if (z0.b.f44979b == null) {
                synchronized (z0.b.f44978a) {
                    if (z0.b.f44979b == null) {
                        z0.b.f44979b = new z0.b();
                    }
                }
            }
            editText.setEditableFactory(z0.b.f44979b);
        }

        @Override // z0.a.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // z0.a.b
        public boolean b() {
            return this.f44977b.f44997f;
        }

        @Override // z0.a.b
        public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f44976a, inputConnection, editorInfo);
        }

        @Override // z0.a.b
        public void d(boolean z10) {
            g gVar = this.f44977b;
            if (gVar.f44997f != z10) {
                if (gVar.f44996e != null) {
                    androidx.emoji2.text.e eVarA = androidx.emoji2.text.e.a();
                    androidx.emoji2.text.e.AbstractC0033e abstractC0033e = gVar.f44996e;
                    Objects.requireNonNull(eVarA);
                    i.f(abstractC0033e, "initCallback cannot be null");
                    eVarA.f1776a.writeLock().lock();
                    try {
                        eVarA.f1777b.remove(abstractC0033e);
                        eVarA.f1776a.writeLock().unlock();
                    } catch (Throwable th) {
                        eVarA.f1776a.writeLock().unlock();
                        throw th;
                    }
                }
                gVar.f44997f = z10;
                if (z10) {
                    g.a(gVar.f44994c, androidx.emoji2.text.e.a().b());
                }
            }
        }
    }

    public static class b {
        public KeyListener a(KeyListener keyListener) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }
    }

    public a(EditText editText) {
        this(editText, true);
    }

    public a(EditText editText, boolean z10) {
        i.f(editText, "editText cannot be null");
        this.f44975a = new C0482a(editText, z10);
    }
}
