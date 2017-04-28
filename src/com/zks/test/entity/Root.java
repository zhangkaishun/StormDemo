package com.zks.test.entity;

import java.util.List;

 class Body {
private String Code;

private String Name;

private String OrgCode;

private String OrgName;

private String GTMATypeCode;

private String GTMATypeName;

private String SubmitDate;

private String Wall;

private String Roof;

private String Structure;

private String Ground;

private int DesignCapacity;

private int ConfirmCapacity;

private int OutLength;

private int OutWidth;

private int OutEavesHeight;

private int OutRoofHeight;

private int OutDiameter;

private int OutWallArea;

private int InLength;

private int InWidth;

private int InEavesHeight;

private int InStoreHeight;

private int InDiameter;

private int InVolume;

private int DoorNumber;

private int DoorHeight;

private int DoorWidth;

private String Memo;

public void setCode(String Code){
this.Code = Code;
}
public String getCode(){
return this.Code;
}
public void setName(String Name){
this.Name = Name;
}
public String getName(){
return this.Name;
}
public void setOrgCode(String OrgCode){
this.OrgCode = OrgCode;
}
public String getOrgCode(){
return this.OrgCode;
}
public void setOrgName(String OrgName){
this.OrgName = OrgName;
}
public String getOrgName(){
return this.OrgName;
}
public void setGTMATypeCode(String GTMATypeCode){
this.GTMATypeCode = GTMATypeCode;
}
public String getGTMATypeCode(){
return this.GTMATypeCode;
}
public void setGTMATypeName(String GTMATypeName){
this.GTMATypeName = GTMATypeName;
}
public String getGTMATypeName(){
return this.GTMATypeName;
}
public void setSubmitDate(String SubmitDate){
this.SubmitDate = SubmitDate;
}
public String getSubmitDate(){
return this.SubmitDate;
}
public void setWall(String Wall){
this.Wall = Wall;
}
public String getWall(){
return this.Wall;
}
public void setRoof(String Roof){
this.Roof = Roof;
}
public String getRoof(){
return this.Roof;
}
public void setStructure(String Structure){
this.Structure = Structure;
}
public String getStructure(){
return this.Structure;
}
public void setGround(String Ground){
this.Ground = Ground;
}
public String getGround(){
return this.Ground;
}
public void setDesignCapacity(int DesignCapacity){
this.DesignCapacity = DesignCapacity;
}
public int getDesignCapacity(){
return this.DesignCapacity;
}
public void setConfirmCapacity(int ConfirmCapacity){
this.ConfirmCapacity = ConfirmCapacity;
}
public int getConfirmCapacity(){
return this.ConfirmCapacity;
}
public void setOutLength(int OutLength){
this.OutLength = OutLength;
}
public int getOutLength(){
return this.OutLength;
}
public void setOutWidth(int OutWidth){
this.OutWidth = OutWidth;
}
public int getOutWidth(){
return this.OutWidth;
}
public void setOutEavesHeight(int OutEavesHeight){
this.OutEavesHeight = OutEavesHeight;
}
public int getOutEavesHeight(){
return this.OutEavesHeight;
}
public void setOutRoofHeight(int OutRoofHeight){
this.OutRoofHeight = OutRoofHeight;
}
public int getOutRoofHeight(){
return this.OutRoofHeight;
}
public void setOutDiameter(int OutDiameter){
this.OutDiameter = OutDiameter;
}
public int getOutDiameter(){
return this.OutDiameter;
}
public void setOutWallArea(int OutWallArea){
this.OutWallArea = OutWallArea;
}
public int getOutWallArea(){
return this.OutWallArea;
}
public void setInLength(int InLength){
this.InLength = InLength;
}
public int getInLength(){
return this.InLength;
}
public void setInWidth(int InWidth){
this.InWidth = InWidth;
}
public int getInWidth(){
return this.InWidth;
}
public void setInEavesHeight(int InEavesHeight){
this.InEavesHeight = InEavesHeight;
}
public int getInEavesHeight(){
return this.InEavesHeight;
}
public void setInStoreHeight(int InStoreHeight){
this.InStoreHeight = InStoreHeight;
}
public int getInStoreHeight(){
return this.InStoreHeight;
}
public void setInDiameter(int InDiameter){
this.InDiameter = InDiameter;
}
public int getInDiameter(){
return this.InDiameter;
}
public void setInVolume(int InVolume){
this.InVolume = InVolume;
}
public int getInVolume(){
return this.InVolume;
}
public void setDoorNumber(int DoorNumber){
this.DoorNumber = DoorNumber;
}
public int getDoorNumber(){
return this.DoorNumber;
}
public void setDoorHeight(int DoorHeight){
this.DoorHeight = DoorHeight;
}
public int getDoorHeight(){
return this.DoorHeight;
}
public void setDoorWidth(int DoorWidth){
this.DoorWidth = DoorWidth;
}
public int getDoorWidth(){
return this.DoorWidth;
}
public void setMemo(String Memo){
this.Memo = Memo;
}
public String getMemo(){
return this.Memo;
}
@Override
public String toString() {
	return "Body [Code=" + Code + ", Name=" + Name + ", OrgCode=" + OrgCode + ", OrgName=" + OrgName + ", GTMATypeCode="
			+ GTMATypeCode + ", GTMATypeName=" + GTMATypeName + ", SubmitDate=" + SubmitDate + ", Wall=" + Wall
			+ ", Roof=" + Roof + ", Structure=" + Structure + ", Ground=" + Ground + ", DesignCapacity="
			+ DesignCapacity + ", ConfirmCapacity=" + ConfirmCapacity + ", OutLength=" + OutLength + ", OutWidth="
			+ OutWidth + ", OutEavesHeight=" + OutEavesHeight + ", OutRoofHeight=" + OutRoofHeight + ", OutDiameter="
			+ OutDiameter + ", OutWallArea=" + OutWallArea + ", InLength=" + InLength + ", InWidth=" + InWidth
			+ ", InEavesHeight=" + InEavesHeight + ", InStoreHeight=" + InStoreHeight + ", InDiameter=" + InDiameter
			+ ", InVolume=" + InVolume + ", DoorNumber=" + DoorNumber + ", DoorHeight=" + DoorHeight + ", DoorWidth="
			+ DoorWidth + ", Memo=" + Memo + "]";
}

}


public class Root {
private String ID;

private String VER;

private String Name;

private String OrgNo;

private String OrgName;

private String SendTime;

private String Type;

private List<Root> Body ;

private String Digest1;

public void setID(String ID){
this.ID = ID;
}
public String getID(){
return this.ID;
}
public void setVER(String VER){
this.VER = VER;
}
public String getVER(){
return this.VER;
}
public void setName(String Name){
this.Name = Name;
}
public String getName(){
return this.Name;
}
public void setOrgNo(String OrgNo){
this.OrgNo = OrgNo;
}
public String getOrgNo(){
return this.OrgNo;
}
public void setOrgName(String OrgName){
this.OrgName = OrgName;
}
public String getOrgName(){
return this.OrgName;
}
public void setSendTime(String SendTime){
this.SendTime = SendTime;
}
public String getSendTime(){
return this.SendTime;
}
public void setType(String Type){
this.Type = Type;
}
public String getType(){
return this.Type;
}
public void setBody(List<Root> Body){
this.Body = Body;
}
public List<Root> getBody(){
return this.Body;
}
public void setDigest1(String Digest1){
this.Digest1 = Digest1;
}
public String getDigest1(){
return this.Digest1;
}
@Override
public String toString() {
	return "Root [ID=" + ID + ", VER=" + VER + ", Name=" + Name + ", OrgNo=" + OrgNo + ", OrgName=" + OrgName
			+ ", SendTime=" + SendTime + ", Type=" + Type + ", Body=" + Body + ", Digest1=" + Digest1 + "]";
}

}