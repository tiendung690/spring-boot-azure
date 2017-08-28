/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.msgraph.api;

import org.springframework.web.client.RestTemplate;

import java.net.URI;

public interface CustomOperations {
    public RestTemplate getRestTemplate();

    public URI getGraphAPIURI(String relativePath);
}