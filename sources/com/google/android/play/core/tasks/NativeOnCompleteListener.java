package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f12526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12527b;

    public NativeOnCompleteListener(long j10, int i10) {
        this.f12526a = j10;
        this.f12527b = i10;
    }

    public native void nativeOnComplete(long j10, int i10, Object obj, int i11);

    @Override // com.google.android.play.core.tasks.OnCompleteListener
    public void onComplete(Task<Object> task) {
        if (!task.isComplete()) {
            throw new IllegalStateException(com.google.android.gms.common.data.a.a(50, "onComplete called for incomplete task: ", this.f12527b));
        }
        if (task.isSuccessful()) {
            nativeOnComplete(this.f12526a, this.f12527b, task.getResult(), 0);
            return;
        }
        Exception exception = task.getException();
        if (!(exception instanceof j)) {
            nativeOnComplete(this.f12526a, this.f12527b, null, -100);
            return;
        }
        int errorCode = ((j) exception).getErrorCode();
        if (errorCode == 0) {
            throw new IllegalStateException(com.google.android.gms.common.data.a.a(51, "TaskException has error code 0 on task: ", this.f12527b));
        }
        nativeOnComplete(this.f12526a, this.f12527b, null, errorCode);
    }
}
