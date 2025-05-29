package com.leonardoalves.qrcode.generator.ports;

public interface StoragePort {
    String upload(byte[] fileData, String fileName, String contentType);
}
