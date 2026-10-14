package ch.qos.logback.core.status;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class StatusBase implements Status {
    private static final List<Status> EMPTY_LIST = new ArrayList(0);
    public List<Status> childrenList;
    public long date;
    public int level;
    public final String message;
    public final Object origin;
    public Throwable throwable;

    public StatusBase(int i10, String str, Object obj) {
        this(i10, str, obj, null);
    }

    public StatusBase(int i10, String str, Object obj, Throwable th) {
        this.level = i10;
        this.message = str;
        this.origin = obj;
        this.throwable = th;
        this.date = System.currentTimeMillis();
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized void add(Status status) {
        try {
            if (status == null) {
                throw new NullPointerException("Null values are not valid Status.");
            }
            if (this.childrenList == null) {
                this.childrenList = new ArrayList();
            }
            this.childrenList.add(status);
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatusBase statusBase = (StatusBase) obj;
        if (this.level != statusBase.level) {
            return false;
        }
        String str = this.message;
        String str2 = statusBase.message;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    @Override // ch.qos.logback.core.status.Status
    public Long getDate() {
        return Long.valueOf(this.date);
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized int getEffectiveLevel() {
        int i10;
        i10 = this.level;
        Iterator<Status> it = iterator();
        while (it.hasNext()) {
            int effectiveLevel = it.next().getEffectiveLevel();
            if (effectiveLevel > i10) {
                i10 = effectiveLevel;
            }
        }
        return i10;
    }

    @Override // ch.qos.logback.core.status.Status
    public int getLevel() {
        return this.level;
    }

    @Override // ch.qos.logback.core.status.Status
    public String getMessage() {
        return this.message;
    }

    @Override // ch.qos.logback.core.status.Status
    public Object getOrigin() {
        return this.origin;
    }

    @Override // ch.qos.logback.core.status.Status
    public Throwable getThrowable() {
        return this.throwable;
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized boolean hasChildren() {
        List<Status> list;
        list = this.childrenList;
        return list != null && list.size() > 0;
    }

    public int hashCode() {
        int i10 = (this.level + 31) * 31;
        String str = this.message;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized Iterator<Status> iterator() {
        List<Status> list = this.childrenList;
        if (list != null) {
            return list.iterator();
        }
        return EMPTY_LIST.iterator();
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized boolean remove(Status status) {
        List<Status> list = this.childrenList;
        if (list == null) {
            return false;
        }
        return list.remove(status);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int effectiveLevel = getEffectiveLevel();
        if (effectiveLevel == 0) {
            str = "INFO";
        } else {
            if (effectiveLevel != 1) {
                if (effectiveLevel == 2) {
                    str = "ERROR";
                }
                if (this.origin != null) {
                    sb2.append(" in ");
                    sb2.append(this.origin);
                    sb2.append(" -");
                }
                sb2.append(" ");
                sb2.append(this.message);
                if (this.throwable != null) {
                    sb2.append(" ");
                    sb2.append(this.throwable);
                }
                return sb2.toString();
            }
            str = "WARN";
        }
        sb2.append(str);
        if (this.origin != null) {
            sb2.append(" in ");
            sb2.append(this.origin);
            sb2.append(" -");
        }
        sb2.append(" ");
        sb2.append(this.message);
        if (this.throwable != null) {
            sb2.append(" ");
            sb2.append(this.throwable);
        }
        return sb2.toString();
    }
}
