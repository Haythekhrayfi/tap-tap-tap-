package fd;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd.z f29540a = new kd.z("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kd.z f29541b = new kd.z("CLOSED_EMPTY");

    public static final long a(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        return j10 >= 9223372036854L ? RecyclerView.FOREVER_NS : 1000000 * j10;
    }
}
