package com.percolate.sdk.rxjava.request.features;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.features.FeaturesParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Features;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Feature request proxy.
 */
@SuppressWarnings("unused")
public class FeaturesRequest {

    private FeaturesService service;

    public FeaturesRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(FeaturesService.class);
    }

    /**
     * Query features endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Features> get(@NotNull final FeaturesParams params) {
        return service.get(params.getParams());
    }
}
