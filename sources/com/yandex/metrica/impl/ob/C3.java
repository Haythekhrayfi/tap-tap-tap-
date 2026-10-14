package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class C3 implements Vm<Thread, C1801m7> {
    @Override // com.yandex.metrica.impl.ob.Vm
    public C1801m7 a(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id2 = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C1801m7(name, priority, id2, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
