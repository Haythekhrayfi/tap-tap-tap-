package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class m extends RecyclerView.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f2390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f2391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<View> f2392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2394e;

    public m(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f2392c = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.inscode.autoclicker.R.id.icon_frame, view.findViewById(com.inscode.autoclicker.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f2390a = view.getBackground();
        if (textView != null) {
            this.f2391b = textView.getTextColors();
        }
    }

    public View a(int i10) {
        View view = this.f2392c.get(i10);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i10);
        if (viewFindViewById != null) {
            this.f2392c.put(i10, viewFindViewById);
        }
        return viewFindViewById;
    }
}
