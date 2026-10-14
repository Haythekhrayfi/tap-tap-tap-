package com.google.android.datatransport.runtime.dagger.internal;

import ic.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class SetFactory<T> implements Factory<Set<T>> {
    private static final Factory<Set<Object>> EMPTY_FACTORY = InstanceFactory.create(Collections.emptySet());
    private final List<a<Collection<T>>> collectionProviders;
    private final List<a<T>> individualProviders;

    public static final class Builder<T> {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        private final List<a<Collection<T>>> collectionProviders;
        private final List<a<T>> individualProviders;

        private Builder(int i10, int i11) {
            this.individualProviders = DaggerCollections.presizedList(i10);
            this.collectionProviders = DaggerCollections.presizedList(i11);
        }

        public Builder<T> addCollectionProvider(a<? extends Collection<? extends T>> aVar) {
            this.collectionProviders.add(aVar);
            return this;
        }

        public Builder<T> addProvider(a<? extends T> aVar) {
            this.individualProviders.add(aVar);
            return this;
        }

        public SetFactory<T> build() {
            return new SetFactory<>(this.individualProviders, this.collectionProviders);
        }
    }

    private SetFactory(List<a<T>> list, List<a<Collection<T>>> list2) {
        this.individualProviders = list;
        this.collectionProviders = list2;
    }

    public static <T> Builder<T> builder(int i10, int i11) {
        return new Builder<>(i10, i11);
    }

    public static <T> Factory<Set<T>> empty() {
        return (Factory<Set<T>>) EMPTY_FACTORY;
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, ic.a
    public Set<T> get() {
        int size = this.individualProviders.size();
        ArrayList arrayList = new ArrayList(this.collectionProviders.size());
        int size2 = this.collectionProviders.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection<T> collection = this.collectionProviders.get(i10).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetNewHashSetWithExpectedSize = DaggerCollections.newHashSetWithExpectedSize(size);
        int size3 = this.individualProviders.size();
        for (int i11 = 0; i11 < size3; i11++) {
            hashSetNewHashSetWithExpectedSize.add(Preconditions.checkNotNull(this.individualProviders.get(i11).get()));
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            Iterator it = ((Collection) arrayList.get(i12)).iterator();
            while (it.hasNext()) {
                hashSetNewHashSetWithExpectedSize.add(Preconditions.checkNotNull(it.next()));
            }
        }
        return Collections.unmodifiableSet(hashSetNewHashSetWithExpectedSize);
    }
}
