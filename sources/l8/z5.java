package l8;

import android.R;
import android.content.res.ColorStateList;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class z5 extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f33011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc.a0<Integer> f33012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc.y f33013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(TextView textView, vc.a0<Integer> a0Var, vc.y yVar) {
        super(0);
        this.f33011c = textView;
        this.f33012d = a0Var;
        this.f33013e = yVar;
    }

    @Override // uc.a
    public jc.w invoke() {
        TextView textView = this.f33011c;
        int[][] iArr = {new int[]{R.attr.state_focused}, new int[0]};
        int[] iArr2 = new int[2];
        Integer num = this.f33012d.f36988c;
        iArr2[0] = num == null ? this.f33013e.f37006c : num.intValue();
        iArr2[1] = this.f33013e.f37006c;
        textView.setTextColor(new ColorStateList(iArr, iArr2));
        return jc.w.f31842a;
    }
}
