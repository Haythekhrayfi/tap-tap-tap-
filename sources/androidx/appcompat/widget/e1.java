package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes.dex */
public class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f1202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f1203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f1204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1206g;

    public e1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1203d = layoutParams;
        this.f1204e = new Rect();
        this.f1205f = new int[2];
        this.f1206g = new int[2];
        this.f1200a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1201b = viewInflate;
        this.f1202c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(e1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131951621;
        layoutParams.flags = 24;
    }

    public void a() {
        if (this.f1201b.getParent() != null) {
            ((WindowManager) this.f1200a.getSystemService("window")).removeView(this.f1201b);
        }
    }
}
