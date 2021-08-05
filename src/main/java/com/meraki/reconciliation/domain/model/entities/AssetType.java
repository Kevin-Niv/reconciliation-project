package com.meraki.reconciliation.domain.model.entities;

public class AssetType {

    private final String assetTypeId;
    private final String assetTypeDescription;

    public AssetType(String assetTypeId, String assetTypeDescription) {
        this.assetTypeId = assetTypeId;
        this.assetTypeDescription = assetTypeDescription;
    }
}
