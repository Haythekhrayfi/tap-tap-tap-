package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.36, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass36 extends BM implements Comparable<AnonymousClass36> {
    public static String[] A01 = {"vLCiYmslEIO8pJY4aanHdZ7QImU9IQkS", "qKFqw4ir5U7ZeqBFISN4Zo", "jSoy0i9dh5CIlqD3dL3njwneSWVMxCrT", "BKJrnveI01f5DMln9XIqip", "hfsDVMr2hJ3AGnbNzVU4gQALPe", "leKVUsav6grkPqjsrOtcGAgCR95imu9O", "O7i9KhUKrr", "K8BeTV5Og7G1zujvrlQB8lJ7v8"};
    public long A00;

    public AnonymousClass36() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AnonymousClass36 anonymousClass36) {
        if (A04() != anonymousClass36.A04()) {
            return A04() ? 1 : -1;
        }
        long j10 = ((X0) this).A00 - ((X0) anonymousClass36).A00;
        if (j10 == 0) {
            long j11 = this.A00;
            long j12 = anonymousClass36.A00;
            if (A01[0].charAt(21) != 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "YA5mbgM7zSdIgspcc6jY8TfuEeXD2Ehe";
            strArr[2] = "tQeim9pVy3EkTEWbzOifosISYdgikQjr";
            j10 = j11 - j12;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
