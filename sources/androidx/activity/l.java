package androidx.activity;

import android.view.View;
import androidx.lifecycle.o0;
import com.inscode.autoclicker.R;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public class l {
    public static void a(Object obj, StringBuilder sb2) {
        String hexString;
        int iLastIndexOf;
        if (obj == null) {
            hexString = "null";
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(iLastIndexOf + 1);
            }
            sb2.append(simpleName);
            sb2.append('{');
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb2.append(hexString);
    }

    public static final e1.a b(o0 o0Var) {
        if (!(o0Var instanceof androidx.lifecycle.h)) {
            return e1.a.C0248a.f28969b;
        }
        e1.a defaultViewModelCreationExtras = ((androidx.lifecycle.h) o0Var).getDefaultViewModelCreationExtras();
        j0.h(defaultViewModelCreationExtras, "{\n        owner.defaultV…ModelCreationExtras\n    }");
        return defaultViewModelCreationExtras;
    }

    public static final void c(View view, h hVar) {
        j0.i(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, hVar);
    }
}
