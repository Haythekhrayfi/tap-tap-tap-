package ch.qos.logback.core.rolling;

import ch.qos.logback.core.util.FileSize;
import defpackage.a;

/* JADX INFO: loaded from: classes.dex */
public class SizeAndTimeBasedRollingPolicy<E> extends TimeBasedRollingPolicy<E> {
    public FileSize maxFileSize;

    public void setMaxFileSize(FileSize fileSize) {
        this.maxFileSize = fileSize;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedRollingPolicy, ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String string;
        SizeAndTimeBasedFNATP sizeAndTimeBasedFNATP = new SizeAndTimeBasedFNATP(SizeAndTimeBasedFNATP.a.EMBEDDED);
        if (this.maxFileSize == null) {
            string = "maxFileSize property is mandatory";
        } else {
            StringBuilder sbA = a.a("Archive files will be limited to [");
            sbA.append(this.maxFileSize);
            sbA.append("] each.");
            addInfo(sbA.toString());
            sizeAndTimeBasedFNATP.setMaxFileSize(this.maxFileSize);
            this.timeBasedFileNamingAndTriggeringPolicy = sizeAndTimeBasedFNATP;
            if (isUnboundedTotalSizeCap() || this.totalSizeCap.getSize() >= this.maxFileSize.getSize()) {
                super.start();
                return;
            }
            StringBuilder sbA2 = a.a("totalSizeCap of [");
            sbA2.append(this.totalSizeCap);
            sbA2.append("] is smaller than maxFileSize [");
            sbA2.append(this.maxFileSize);
            sbA2.append("] which is non-sensical");
            string = sbA2.toString();
        }
        addError(string);
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedRollingPolicy
    public String toString() {
        StringBuilder sbA = a.a("c.q.l.core.rolling.SizeAndTimeBasedRollingPolicy@");
        sbA.append(hashCode());
        return sbA.toString();
    }
}
