package q9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.k0;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f34847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f34848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f34850d;

    public interface a {

        /* JADX INFO: renamed from: q9.b$a$a, reason: collision with other inner class name */
        public static class C0392a implements a {
            @Override // q9.b.a
            public void a(k0 k0Var) {
            }

            @Override // q9.b.a
            public void b() {
            }
        }

        void a(k0 k0Var);

        void b();
    }

    public b(Context context, View view, ViewGroup viewGroup) {
        this(context, view, viewGroup, R.dimen.overflow_menu_margin_horizontal, R.dimen.overflow_menu_margin_vertical);
    }

    public b(Context context, View view, ViewGroup viewGroup, int i10, int i11) {
        this.f34849c = 83;
        this.f34847a = view;
        this.f34848b = viewGroup;
    }
}
