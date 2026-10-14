package r1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35096a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f35097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f35098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f35099d;

    public j(ViewGroup viewGroup) {
        this.f35097b = viewGroup;
    }

    public j(ViewGroup viewGroup, View view) {
        this.f35097b = viewGroup;
        this.f35098c = view;
    }

    public static j b(ViewGroup viewGroup) {
        return (j) viewGroup.getTag(R.id.transition_current_scene);
    }

    public void a() {
        if (this.f35096a > 0 || this.f35098c != null) {
            this.f35097b.removeAllViews();
            if (this.f35096a > 0) {
                LayoutInflater.from(null).inflate(this.f35096a, this.f35097b);
            } else {
                this.f35097b.addView(this.f35098c);
            }
        }
        this.f35097b.setTag(R.id.transition_current_scene, this);
    }
}
