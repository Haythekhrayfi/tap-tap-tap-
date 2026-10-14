package ch.qos.logback.core.recovery;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import defpackage.a;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResilientOutputStreamBase extends OutputStream {
    public static final int STATUS_COUNT_LIMIT = 8;
    private Context context;
    public OutputStream os;
    private RecoveryCoordinator recoveryCoordinator;
    private int noContextWarning = 0;
    private int statusCount = 0;
    public boolean presumedClean = true;

    private boolean isPresumedInError() {
        return (this.recoveryCoordinator == null || this.presumedClean) ? false : true;
    }

    private void postSuccessfulWrite() {
        if (this.recoveryCoordinator != null) {
            this.recoveryCoordinator = null;
            this.statusCount = 0;
            StringBuilder sbA = a.a("Recovered from IO failure on ");
            sbA.append(getDescription());
            addStatus(new InfoStatus(sbA.toString(), this));
        }
    }

    public void addStatus(Status status) {
        Context context = this.context;
        if (context != null) {
            StatusManager statusManager = context.getStatusManager();
            if (statusManager != null) {
                statusManager.add(status);
                return;
            }
            return;
        }
        int i10 = this.noContextWarning;
        this.noContextWarning = i10 + 1;
        if (i10 == 0) {
            System.out.println("LOGBACK: No context given for " + this);
        }
    }

    public void addStatusIfCountNotOverLimit(Status status) {
        int i10 = this.statusCount + 1;
        this.statusCount = i10;
        if (i10 < 8) {
            addStatus(status);
        }
        if (this.statusCount == 8) {
            addStatus(status);
            StringBuilder sbA = a.a("Will supress future messages regarding ");
            sbA.append(getDescription());
            addStatus(new InfoStatus(sbA.toString(), this));
        }
    }

    public void attemptRecovery() {
        try {
            close();
        } catch (IOException unused) {
        }
        StringBuilder sbA = a.a("Attempting to recover from IO failure on ");
        sbA.append(getDescription());
        addStatusIfCountNotOverLimit(new InfoStatus(sbA.toString(), this));
        try {
            this.os = openNewOutputStream();
            this.presumedClean = true;
        } catch (IOException e10) {
            StringBuilder sbA2 = a.a("Failed to open ");
            sbA2.append(getDescription());
            addStatusIfCountNotOverLimit(new ErrorStatus(sbA2.toString(), this, e10));
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.os;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        OutputStream outputStream = this.os;
        if (outputStream != null) {
            try {
                outputStream.flush();
                postSuccessfulWrite();
            } catch (IOException e10) {
                postIOFailure(e10);
            }
        }
    }

    public Context getContext() {
        return this.context;
    }

    public abstract String getDescription();

    public abstract OutputStream openNewOutputStream() throws IOException;

    public void postIOFailure(IOException iOException) {
        StringBuilder sbA = a.a("IO failure while writing to ");
        sbA.append(getDescription());
        addStatusIfCountNotOverLimit(new ErrorStatus(sbA.toString(), this, iOException));
        this.presumedClean = false;
        if (this.recoveryCoordinator == null) {
            this.recoveryCoordinator = new RecoveryCoordinator();
        }
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        if (isPresumedInError()) {
            if (this.recoveryCoordinator.isTooSoon()) {
                return;
            }
            attemptRecovery();
        } else {
            try {
                this.os.write(i10);
                postSuccessfulWrite();
            } catch (IOException e10) {
                postIOFailure(e10);
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        if (isPresumedInError()) {
            if (this.recoveryCoordinator.isTooSoon()) {
                return;
            }
            attemptRecovery();
        } else {
            try {
                this.os.write(bArr, i10, i11);
                postSuccessfulWrite();
            } catch (IOException e10) {
                postIOFailure(e10);
            }
        }
    }
}
