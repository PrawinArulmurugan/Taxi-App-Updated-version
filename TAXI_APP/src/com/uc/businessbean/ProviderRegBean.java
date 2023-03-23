package com.uc.businessbean;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;
@SuppressWarnings("unused")
public class ProviderRegBean {

		private Integer provider_ID;
		private String provider_Name;
		private long contact;
		private String email;
		private String Address;
		private MultipartFile provider_Image;
		
		private byte[] provider_Photo;
		private String userName;
		private String password;
		private String carType;
		private String carModel;
		private String regNumber;
		private MultipartFile car_Image;
		
		private byte[] carPhoto;
		private String licenseNum;
		private MultipartFile license_Image;
		
		private byte[] license_Photo;
		private String rcNum;
		private MultipartFile rc_Image;
		
		private byte[] rc_Photo;
		
		public Integer getProvider_ID() {
			return provider_ID;
		}
		public void setProvider_ID(Integer provider_ID) {
			this.provider_ID = provider_ID;
		}
		public String getProvider_Name() {
			return provider_Name;
		}
		public void setProvider_Name(String provider_Name) {
			this.provider_Name = provider_Name;
		}
		public long getContact() {
			return contact;
		}
		public void setContact(long contact) {
			this.contact = contact;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public MultipartFile getProvider_Image() {
			return provider_Image;
		}
		public void setProvider_Image(MultipartFile provider_Image) {
			this.provider_Image = provider_Image;
			try {
				provider_Photo=provider_Image.getBytes();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getCarType() {
			return carType;
		}
		public void setCarType(String carType) {
			this.carType = carType;
		}
		public String getCarModel() {
			return carModel;
		}
		public void setCarModel(String carModel) {
			this.carModel = carModel;
		}
		public String getRegNumber() {
			return regNumber;
		}
		public void setRegNumber(String regNumber) {
			this.regNumber = regNumber;
		}
		public MultipartFile getCar_Image() {
			return car_Image;
		}
		public void setCar_Image(MultipartFile car_Image) {
			this.car_Image = car_Image;
			try {
				carPhoto=car_Image.getBytes();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public String getLicenseNum() {
			return licenseNum;
		}
		public void setLicenseNum(String licenseNum) {
			this.licenseNum = licenseNum;
		}
		public MultipartFile getLicense_Image() {
			return license_Image;
		}
		public void setLicense_Image(MultipartFile license_Image) {
			this.license_Image = license_Image;
			try {
				license_Photo=license_Image.getBytes();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		public String getRcNum() {
			return rcNum;
		}
		public void setRcNum(String rcNum) {
			this.rcNum = rcNum;
		}
		public MultipartFile getRc_Image() {
			return rc_Image;
		}
		public void setRc_Image(MultipartFile rc_Image) {
			this.rc_Image = rc_Image;
			try {
				rc_Photo=rc_Image.getBytes();
			} catch (IOException e) {
		
				e.printStackTrace();
			}
		}
		
	
		
		
		

}
