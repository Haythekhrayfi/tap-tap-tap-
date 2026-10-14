package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.RollingCalendar;
import ch.qos.logback.core.spi.ContextAwareBase;
import defpackage.a;
import java.io.File;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class TimeBasedFileNamingAndTriggeringPolicyBase<E> extends ContextAwareBase implements TimeBasedFileNamingAndTriggeringPolicy<E> {
    private static String COLLIDING_DATE_FORMAT_URL = "http://logback.qos.ch/codes.html#rfa_collision_in_dateFormat";
    public String elapsedPeriodsFileName;
    public long nextCheck;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    public RollingCalendar f3718rc;
    public TimeBasedRollingPolicy<E> tbrp;
    public ArchiveRemover archiveRemover = null;
    public long artificialCurrentTime = -1;
    public Date dateInCurrentPeriod = null;
    public boolean started = false;
    public boolean errorFree = true;

    public void computeNextCheck() {
        this.nextCheck = this.f3718rc.getNextTriggeringDate(this.dateInCurrentPeriod).getTime();
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public ArchiveRemover getArchiveRemover() {
        return this.archiveRemover;
    }

    public String getCurrentPeriodsFileNameWithoutCompressionSuffix() {
        return this.tbrp.fileNamePatternWithoutCompSuffix.convert(this.dateInCurrentPeriod);
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public long getCurrentTime() {
        long j10 = this.artificialCurrentTime;
        return j10 >= 0 ? j10 : System.currentTimeMillis();
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public String getElapsedPeriodsFileName() {
        return this.elapsedPeriodsFileName;
    }

    public boolean isErrorFree() {
        return this.errorFree;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.started;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public void setCurrentTime(long j10) {
        this.artificialCurrentTime = j10;
    }

    public void setDateInCurrentPeriod(long j10) {
        this.dateInCurrentPeriod.setTime(j10);
    }

    public void setDateInCurrentPeriod(Date date) {
        this.dateInCurrentPeriod = date;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public void setTimeBasedRollingPolicy(TimeBasedRollingPolicy<E> timeBasedRollingPolicy) {
        this.tbrp = timeBasedRollingPolicy;
    }

    public void start() {
        DateTokenConverter<Object> primaryDateTokenConverter = this.tbrp.fileNamePattern.getPrimaryDateTokenConverter();
        if (primaryDateTokenConverter == null) {
            StringBuilder sbA = a.a("FileNamePattern [");
            sbA.append(this.tbrp.fileNamePattern.getPattern());
            sbA.append("] does not contain a valid DateToken");
            throw new IllegalStateException(sbA.toString());
        }
        this.f3718rc = primaryDateTokenConverter.getTimeZone() != null ? new RollingCalendar(primaryDateTokenConverter.getDatePattern(), primaryDateTokenConverter.getTimeZone(), Locale.US) : new RollingCalendar(primaryDateTokenConverter.getDatePattern());
        StringBuilder sbA2 = a.a("The date pattern is '");
        sbA2.append(primaryDateTokenConverter.getDatePattern());
        sbA2.append("' from file name pattern '");
        sbA2.append(this.tbrp.fileNamePattern.getPattern());
        sbA2.append("'.");
        addInfo(sbA2.toString());
        this.f3718rc.printPeriodicity(this);
        if (!this.f3718rc.isCollisionFree()) {
            addError("The date format in FileNamePattern will result in collisions in the names of archived log files.");
            addError(COLLIDING_DATE_FORMAT_URL);
            withErrors();
            return;
        }
        setDateInCurrentPeriod(new Date(getCurrentTime()));
        if (this.tbrp.getParentsRawFileProperty() != null) {
            File file = new File(this.tbrp.getParentsRawFileProperty());
            if (file.exists() && file.canRead()) {
                setDateInCurrentPeriod(new Date(file.lastModified()));
            }
        }
        StringBuilder sbA3 = a.a("Setting initial period to ");
        sbA3.append(this.dateInCurrentPeriod);
        addInfo(sbA3.toString());
        computeNextCheck();
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.started = false;
    }

    public void withErrors() {
        this.errorFree = false;
    }
}
