package re;

/* JADX INFO: loaded from: classes3.dex */
public interface i {
    <R extends d> R adjustInto(R r10, long j10);

    long getFrom(e eVar);

    boolean isDateBased();

    boolean isSupportedBy(e eVar);

    boolean isTimeBased();

    n range();

    n rangeRefinedBy(e eVar);
}
