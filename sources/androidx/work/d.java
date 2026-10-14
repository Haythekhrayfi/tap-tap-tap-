package androidx.work;

import fd.j0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public enum d implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        j0.i(runnable, "command");
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
