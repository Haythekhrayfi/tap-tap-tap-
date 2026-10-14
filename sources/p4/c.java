package p4;

import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes.dex */
public final class c implements RewardItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34455b;

    public c(int i10, String str) {
        this.f34454a = i10;
        this.f34455b = str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return this.f34454a;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return this.f34455b;
    }
}
