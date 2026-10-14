package ch.qos.logback.core;

import androidx.activity.result.c;
import ch.qos.logback.core.joran.spi.ConsoleTarget;
import ch.qos.logback.core.status.WarnStatus;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ConsoleAppender<E> extends OutputStreamAppender<E> {
    public ConsoleTarget target = ConsoleTarget.SystemOut;

    private void targetWarn(String str) {
        StringBuilder sbA = c.a("[", str, "] should be one of ");
        sbA.append(Arrays.toString(ConsoleTarget.values()));
        WarnStatus warnStatus = new WarnStatus(sbA.toString(), this);
        warnStatus.add(new WarnStatus("Using previously set target, System.out by default.", this));
        addStatus(warnStatus);
    }

    public String getTarget() {
        return this.target.getName();
    }

    public void setTarget(String str) {
        ConsoleTarget consoleTargetFindByName = ConsoleTarget.findByName(str.trim());
        if (consoleTargetFindByName == null) {
            targetWarn(str);
        } else {
            this.target = consoleTargetFindByName;
        }
    }

    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        setOutputStream(this.target.getStream());
        super.start();
    }
}
