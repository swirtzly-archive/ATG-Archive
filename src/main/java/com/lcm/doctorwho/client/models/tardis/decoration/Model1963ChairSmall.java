package com.lcm.doctorwho.client.models.tardis.decoration;

import com.lcm.doctorwho.AcrossTheGalaxy;
import com.lcm.doctorwho.client.models.interfaces.ITardisModel;
import com.lcm.doctorwho.client.models.interfaces.ITileModel;
import com.lcm.doctorwho.utils.ATGUtils;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
public class Model1963ChairSmall extends ModelBase implements ITileModel {

    private ResourceLocation TEX = new ResourceLocation(AcrossTheGalaxy.MODID, "textures/models/tardis/1963/1963_chair_small.png");
    ModelRenderer MS1;
    ModelRenderer insert_name;
    ModelRenderer MS3;
    ModelRenderer MS4;
    ModelRenderer MS5;
    ModelRenderer MS6;
    ModelRenderer MS7;
    ModelRenderer MS8;
    ModelRenderer MS9;
    ModelRenderer MS10;
    ModelRenderer MS11;
    ModelRenderer ST11;
    ModelRenderer MS13;
    ModelRenderer MS14;
    ModelRenderer ST1;
    ModelRenderer ST2;
    ModelRenderer ST3;
    ModelRenderer ST4;
    ModelRenderer ST5;
    ModelRenderer ST6;
    ModelRenderer ST7;
    ModelRenderer ST8;
    ModelRenderer ST9;
    ModelRenderer ST10;
    ModelRenderer stwhatthough;
    ModelRenderer ST12;
    ModelRenderer ST13;
    ModelRenderer ST14;
    ModelRenderer ST15;
    ModelRenderer ST16;
    ModelRenderer ST17;
    ModelRenderer ST18;
    ModelRenderer ST19;
    ModelRenderer Tas1;
    ModelRenderer Tas2;
    ModelRenderer Sup1;
    ModelRenderer Sup2;
    ModelRenderer Sup3;
    ModelRenderer Sup4;
    ModelRenderer Sup5;
    ModelRenderer Sup6;
    ModelRenderer Sup7;
    ModelRenderer Sup8;
    ModelRenderer Sup9;
    ModelRenderer Sup10;
    ModelRenderer Sup11;
    ModelRenderer Sup12;
    ModelRenderer Sup13;
    ModelRenderer Sup14;
    ModelRenderer Sup15;
    ModelRenderer Sup16;
    ModelRenderer Sup17;
    ModelRenderer Sup18;
    ModelRenderer Sup19;
    ModelRenderer Sup20;
    ModelRenderer Sup21;
    ModelRenderer Sup22;
    ModelRenderer Sup23;
    ModelRenderer Sup24;
    ModelRenderer Sup25;
    ModelRenderer Sup26;
    ModelRenderer Sup27;
    ModelRenderer Sup28;
    ModelRenderer Sup29;
    ModelRenderer Sup30;
    ModelRenderer Sup31;

    public Model1963ChairSmall()
    {
        textureWidth = 128;
        textureHeight = 128;

        MS1 = new ModelRenderer(this, 0, 16);
        MS1.addBox(6.5F, -15.5F, 0F, 2, 1, 2);
        MS1.setRotationPoint(0F, 10F, 3.5F);
        MS1.setTextureSize(128, 128);
        MS1.mirror = true;
        ATGUtils.setRotation(MS1, -0.2617994F, 0F, 0F);
        insert_name = new ModelRenderer(this, 0, 0);
        insert_name.addBox(-8F, -12F, -5F, 16, 2, 10);
        insert_name.setRotationPoint(0F, 23F, 0F);
        insert_name.setTextureSize(128, 128);
        insert_name.mirror = true;
        ATGUtils.setRotation(insert_name, 0F, 0F, 0F);
        MS3 = new ModelRenderer(this, 11, 14);
        MS3.addBox(-8.5F, -17F, -6.5F, 2, 1, 12);
        MS3.setRotationPoint(0F, 23F, 0F);
        MS3.setTextureSize(128, 128);
        MS3.mirror = true;
        ATGUtils.setRotation(MS3, 0F, 0F, 0F);
        MS4 = new ModelRenderer(this, 0, 21);
        MS4.addBox(6.5F, -15F, 1F, 2, 1, 1);
        MS4.setRotationPoint(0F, 10F, 3.5F);
        MS4.setTextureSize(128, 128);
        MS4.mirror = true;
        ATGUtils.setRotation(MS4, -0.2617994F, 0F, 0F);
        MS5 = new ModelRenderer(this, 11, 14);
        MS5.addBox(6.5F, -17F, -6.5F, 2, 1, 12);
        MS5.setRotationPoint(0F, 23F, 0F);
        MS5.setTextureSize(128, 128);
        MS5.mirror = true;
        ATGUtils.setRotation(MS5, 0F, 0F, 0F);
        MS6 = new ModelRenderer(this, 0, 26);
        MS6.addBox(6.5F, -16F, -5.5F, 2, 17, 2);
        MS6.setRotationPoint(0F, 23F, 0F);
        MS6.setTextureSize(128, 128);
        MS6.mirror = true;
        ATGUtils.setRotation(MS6, 0F, 0F, 0F);
        MS7 = new ModelRenderer(this, 0, 26);
        MS7.addBox(-8.5F, -16F, -5.5F, 2, 17, 2);
        MS7.setRotationPoint(0F, 23F, 0F);
        MS7.setTextureSize(128, 128);
        MS7.mirror = true;
        ATGUtils.setRotation(MS7, 0F, 0F, 0F);
        MS8 = new ModelRenderer(this, 0, 26);
        MS8.addBox(6.5F, -13F, 3.5F, 2, 14, 2);
        MS8.setRotationPoint(0F, 23F, 0F);
        MS8.setTextureSize(128, 128);
        MS8.mirror = true;
        ATGUtils.setRotation(MS8, 0F, 0F, 0F);
        MS9 = new ModelRenderer(this, 0, 26);
        MS9.addBox(-8.5F, -14F, 0F, 2, 14, 2);
        MS9.setRotationPoint(0F, 10F, 3.5F);
        MS9.setTextureSize(128, 128);
        MS9.mirror = true;
        ATGUtils.setRotation(MS9, -0.2617994F, 0F, 0F);
        MS10 = new ModelRenderer(this, 0, 26);
        MS10.addBox(6.5F, -14F, 0F, 2, 14, 2);
        MS10.setRotationPoint(0F, 10F, 3.5F);
        MS10.setTextureSize(128, 128);
        MS10.mirror = true;
        ATGUtils.setRotation(MS10, -0.2617994F, 0F, 0F);
        MS11 = new ModelRenderer(this, 10, 30);
        MS11.addBox(-6.5F, -13F, 0F, 13, 8, 2);
        MS11.setRotationPoint(0F, 10F, 3.5F);
        MS11.setTextureSize(128, 128);
        MS11.mirror = true;
        ATGUtils.setRotation(MS11, -0.2617994F, 0F, 0F);
        ST11 = new ModelRenderer(this, 0, 16);
        ST11.addBox(-8.5F, -15.5F, 0F, 2, 1, 2);
        ST11.setRotationPoint(0F, 10F, 3.5F);
        ST11.setTextureSize(128, 128);
        ST11.mirror = true;
        ATGUtils.setRotation(ST11, -0.2617994F, 0F, 0F);
        MS13 = new ModelRenderer(this, 0, 21);
        MS13.addBox(-8.5F, -15F, 1F, 2, 1, 1);
        MS13.setRotationPoint(0F, 10F, 3.5F);
        MS13.setTextureSize(128, 128);
        MS13.mirror = true;
        ATGUtils.setRotation(MS13, -0.2617994F, 0F, 0F);
        MS14 = new ModelRenderer(this, 0, 26);
        MS14.addBox(-8.5F, -13F, 3.5F, 2, 14, 2);
        MS14.setRotationPoint(0F, 23F, 0F);
        MS14.setTextureSize(128, 128);
        MS14.mirror = true;
        ATGUtils.setRotation(MS14, 0F, 0F, 0F);
        ST1 = new ModelRenderer(this, 0, 0);
        ST1.addBox(-5F, -11.5F, -5.5F, 1, 1, 1);
        ST1.setRotationPoint(0F, 23F, 0F);
        ST1.setTextureSize(128, 128);
        ST1.mirror = true;
        ATGUtils.setRotation(ST1, 0F, 0F, 0F);
        ST2 = new ModelRenderer(this, 0, 0);
        ST2.addBox(-8F, -9.25F, -0.5F, 1, 1, 1);
        ST2.setRotationPoint(0F, 10F, 3.5F);
        ST2.setTextureSize(128, 128);
        ST2.mirror = true;
        ATGUtils.setRotation(ST2, -0.2617994F, 0F, 0F);
        ST3 = new ModelRenderer(this, 0, 0);
        ST3.addBox(8F, -12.5F, 0.5F, 1, 1, 1);
        ST3.setRotationPoint(0F, 10F, 3.5F);
        ST3.setTextureSize(128, 128);
        ST3.mirror = true;
        ATGUtils.setRotation(ST3, -0.2617994F, 0F, 0F);
        ST4 = new ModelRenderer(this, 0, 0);
        ST4.addBox(4F, -11.5F, -5.5F, 1, 1, 1);
        ST4.setRotationPoint(0F, 23F, 0F);
        ST4.setTextureSize(128, 128);
        ST4.mirror = true;
        ATGUtils.setRotation(ST4, 0F, 0F, 0F);
        ST5 = new ModelRenderer(this, 0, 0);
        ST5.addBox(8F, -9.25F, 0.5F, 1, 1, 1);
        ST5.setRotationPoint(0F, 10F, 3.5F);
        ST5.setTextureSize(128, 128);
        ST5.mirror = true;
        ATGUtils.setRotation(ST5, -0.2617994F, 0F, 0F);
        ST6 = new ModelRenderer(this, 0, 0);
        ST6.addBox(-0.5F, -12.5F, -0.5F, 1, 1, 1);
        ST6.setRotationPoint(0F, 10F, 3.5F);
        ST6.setTextureSize(128, 128);
        ST6.mirror = true;
        ATGUtils.setRotation(ST6, -0.2617994F, 0F, 0F);
        ST7 = new ModelRenderer(this, 0, 0);
        ST7.addBox(8F, -6F, 0.5F, 1, 1, 1);
        ST7.setRotationPoint(0F, 10F, 3.5F);
        ST7.setTextureSize(128, 128);
        ST7.mirror = true;
        ATGUtils.setRotation(ST7, -0.2617994F, 0F, 0F);
        ST8 = new ModelRenderer(this, 0, 0);
        ST8.addBox(7F, -12.5F, -0.5F, 1, 1, 1);
        ST8.setRotationPoint(0F, 10F, 3.5F);
        ST8.setTextureSize(128, 128);
        ST8.mirror = true;
        ATGUtils.setRotation(ST8, -0.2617994F, 0F, 0F);
        ST9 = new ModelRenderer(this, 0, 0);
        ST9.addBox(7F, -9.75F, -0.5F, 1, 1, 1);
        ST9.setRotationPoint(0F, 10F, 3.5F);
        ST9.setTextureSize(128, 128);
        ST9.mirror = true;
        ATGUtils.setRotation(ST9, -0.2617994F, 0F, 0F);
        ST10 = new ModelRenderer(this, 0, 0);
        ST10.addBox(7F, -6.5F, -0.5F, 1, 1, 1);
        ST10.setRotationPoint(0F, 10F, 3.5F);
        ST10.setTextureSize(128, 128);
        ST10.mirror = true;
        ATGUtils.setRotation(ST10, -0.2617994F, 0F, 0F);
        stwhatthough = new ModelRenderer(this, 0, 0);
        stwhatthough.addBox(-9F, -6F, 0.5F, 1, 1, 1);
        stwhatthough.setRotationPoint(0F, 10F, 3.5F);
        stwhatthough.setTextureSize(128, 128);
        stwhatthough.mirror = true;
        ATGUtils.setRotation(stwhatthough, -0.2617994F, 0F, 0F);
        ST12 = new ModelRenderer(this, 0, 0);
        ST12.addBox(-2F, -11.5F, -5.5F, 1, 1, 1);
        ST12.setRotationPoint(0F, 23F, 0F);
        ST12.setTextureSize(128, 128);
        ST12.mirror = true;
        ATGUtils.setRotation(ST12, 0F, 0F, 0F);
        ST13 = new ModelRenderer(this, 0, 0);
        ST13.addBox(-9F, -12.5F, 0.5F, 1, 1, 1);
        ST13.setRotationPoint(0F, 10F, 3.5F);
        ST13.setTextureSize(128, 128);
        ST13.mirror = true;
        ATGUtils.setRotation(ST13, -0.2617994F, 0F, 0F);
        ST14 = new ModelRenderer(this, 0, 0);
        ST14.addBox(1F, -11.5F, -5.5F, 1, 1, 1);
        ST14.setRotationPoint(0F, 23F, 0F);
        ST14.setTextureSize(128, 128);
        ST14.mirror = true;
        ATGUtils.setRotation(ST14, 0F, 0F, 0F);
        ST15 = new ModelRenderer(this, 0, 0);
        ST15.addBox(-9F, -9.25F, 0.5F, 1, 1, 1);
        ST15.setRotationPoint(0F, 10F, 3.5F);
        ST15.setTextureSize(128, 128);
        ST15.mirror = true;
        ATGUtils.setRotation(ST15, -0.2617994F, 0F, 0F);
        ST16 = new ModelRenderer(this, 0, 0);
        ST16.addBox(-8F, -6F, -0.5F, 1, 1, 1);
        ST16.setRotationPoint(0F, 10F, 3.5F);
        ST16.setTextureSize(128, 128);
        ST16.mirror = true;
        ATGUtils.setRotation(ST16, -0.2617994F, 0F, 0F);
        ST17 = new ModelRenderer(this, 0, 0);
        ST17.addBox(-4.25F, -12.5F, -0.5F, 1, 1, 1);
        ST17.setRotationPoint(0F, 10F, 3.5F);
        ST17.setTextureSize(128, 128);
        ST17.mirror = true;
        ATGUtils.setRotation(ST17, -0.2617994F, 0F, 0F);
        ST18 = new ModelRenderer(this, 0, 0);
        ST18.addBox(-8F, -12.5F, -0.5F, 1, 1, 1);
        ST18.setRotationPoint(0F, 10F, 3.5F);
        ST18.setTextureSize(128, 128);
        ST18.mirror = true;
        ATGUtils.setRotation(ST18, -0.2617994F, 0F, 0F);
        ST19 = new ModelRenderer(this, 0, 0);
        ST19.addBox(3.25F, -12.5F, -0.5F, 1, 1, 1);
        ST19.setRotationPoint(0F, 10F, 3.5F);
        ST19.setTextureSize(128, 128);
        ST19.mirror = true;
        ATGUtils.setRotation(ST19, -0.2617994F, 0F, 0F);
        Tas1 = new ModelRenderer(this, 14, 42);
        Tas1.addBox(-6.5F, -5F, -0.43F, 13, 3, 1);
        Tas1.setRotationPoint(0F, 10F, 3.5F);
        Tas1.setTextureSize(128, 128);
        Tas1.mirror = true;
        ATGUtils.setRotation(Tas1, -0.2617994F, 0F, 0F);
        Tas2 = new ModelRenderer(this, 14, 42);
        Tas2.addBox(-6.5F, -10.5F, -5.4F, 13, 3, 1);
        Tas2.setRotationPoint(0F, 23F, 0F);
        Tas2.setTextureSize(128, 128);
        Tas2.mirror = true;
        ATGUtils.setRotation(Tas2, 0F, 0F, 0F);
        Sup1 = new ModelRenderer(this, 110, 0);
        Sup1.addBox(-0.5F, -1.5F, -1.25F, 1, 3, 1);
        Sup1.setRotationPoint(-3.5F, 17F, -4F);
        Sup1.setTextureSize(128, 128);
        Sup1.mirror = true;
        ATGUtils.setRotation(Sup1, 0F, 0F, 0.7853982F);
        Sup2 = new ModelRenderer(this, 0, 13);
        Sup2.addBox(2.5F, -6.5F, -5F, 2, 1, 1);
        Sup2.setRotationPoint(0F, 23F, 0F);
        Sup2.setTextureSize(128, 128);
        Sup2.mirror = true;
        ATGUtils.setRotation(Sup2, 0F, 0F, 0F);
        Sup3 = new ModelRenderer(this, 72, 0);
        Sup3.addBox(1F, -1F, 0F, 1, 1, 2);
        Sup3.setRotationPoint(6F, 21.5F, -1.5F);
        Sup3.setTextureSize(128, 128);
        Sup3.mirror = true;
        ATGUtils.setRotation(Sup3, 0.3490659F, 0F, 0F);
        Sup4 = new ModelRenderer(this, 72, 0);
        Sup4.addBox(-8F, -2.5F, 1.5F, 1, 1, 2);
        Sup4.setRotationPoint(0F, 23F, 0F);
        Sup4.setTextureSize(128, 128);
        Sup4.mirror = true;
        ATGUtils.setRotation(Sup4, 0F, 0F, 0F);
        Sup5 = new ModelRenderer(this, 54, 0);
        Sup5.addBox(7F, -4F, -3.5F, 1, 2, 7);
        Sup5.setRotationPoint(0F, 23F, 0F);
        Sup5.setTextureSize(128, 128);
        Sup5.mirror = true;
        ATGUtils.setRotation(Sup5, 0F, 0F, 0F);
        Sup6 = new ModelRenderer(this, 72, 0);
        Sup6.addBox(7F, -2.5F, 1.5F, 1, 1, 2);
        Sup6.setRotationPoint(0F, 23F, 0F);
        Sup6.setTextureSize(128, 128);
        Sup6.mirror = true;
        ATGUtils.setRotation(Sup6, 0F, 0F, 0F);
        Sup7 = new ModelRenderer(this, 72, 0);
        Sup7.addBox(-14F, -1F, 0F, 1, 1, 2);
        Sup7.setRotationPoint(6F, 21.5F, -1.5F);
        Sup7.setTextureSize(128, 128);
        Sup7.mirror = true;
        ATGUtils.setRotation(Sup7, 0.3490659F, 0F, 0F);
        Sup8 = new ModelRenderer(this, 72, 0);
        Sup8.addBox(7F, -2.5F, -3.5F, 1, 1, 2);
        Sup8.setRotationPoint(0F, 23F, 0F);
        Sup8.setTextureSize(128, 128);
        Sup8.mirror = true;
        ATGUtils.setRotation(Sup8, 0F, 0F, 0F);
        Sup9 = new ModelRenderer(this, 72, 0);
        Sup9.addBox(-8F, -2.5F, -3.5F, 1, 1, 2);
        Sup9.setRotationPoint(0F, 23F, 0F);
        Sup9.setTextureSize(128, 128);
        Sup9.mirror = true;
        ATGUtils.setRotation(Sup9, 0F, 0F, 0F);
        Sup10 = new ModelRenderer(this, 72, 0);
        Sup10.addBox(-14F, -1F, -2F, 1, 1, 2);
        Sup10.setRotationPoint(6F, 21.5F, 1.5F);
        Sup10.setTextureSize(128, 128);
        Sup10.mirror = true;
        ATGUtils.setRotation(Sup10, -0.3490659F, 0F, 0F);
        Sup11 = new ModelRenderer(this, 54, 0);
        Sup11.addBox(-8F, -4F, -3.5F, 1, 2, 7);
        Sup11.setRotationPoint(0F, 23F, 0F);
        Sup11.setTextureSize(128, 128);
        Sup11.mirror = true;
        ATGUtils.setRotation(Sup11, 0F, 0F, 0F);
        Sup12 = new ModelRenderer(this, 80, 0);
        Sup12.addBox(-6.5F, -4F, 4F, 13, 2, 1);
        Sup12.setRotationPoint(0F, 23F, 0F);
        Sup12.setTextureSize(128, 128);
        Sup12.mirror = true;
        ATGUtils.setRotation(Sup12, 0F, 0F, 0F);
        Sup13 = new ModelRenderer(this, 72, 0);
        Sup13.addBox(1F, -1F, -2F, 1, 1, 2);
        Sup13.setRotationPoint(6F, 21.5F, 1.5F);
        Sup13.setTextureSize(128, 128);
        Sup13.mirror = true;
        ATGUtils.setRotation(Sup13, -0.3490659F, 0F, 0F);
        Sup14 = new ModelRenderer(this, 6, 47);
        Sup14.addBox(-1F, -0.5F, -1.2F, 2, 1, 1);
        Sup14.setRotationPoint(3.5F, 17F, -4F);
        Sup14.setTextureSize(128, 128);
        Sup14.mirror = true;
        ATGUtils.setRotation(Sup14, 0F, 0F, 0F);
        Sup15 = new ModelRenderer(this, 6, 47);
        Sup15.addBox(-1F, -0.5F, -1.2F, 2, 1, 1);
        Sup15.setRotationPoint(-3.5F, 17F, -4F);
        Sup15.setTextureSize(128, 128);
        Sup15.mirror = true;
        ATGUtils.setRotation(Sup15, 0F, 0F, 0F);
        Sup16 = new ModelRenderer(this, 41, 14);
        Sup16.addBox(-6.5F, -7.5F, -5F, 13, 1, 1);
        Sup16.setRotationPoint(0F, 23F, 0F);
        Sup16.setTextureSize(128, 128);
        Sup16.mirror = true;
        ATGUtils.setRotation(Sup16, 0F, 0F, 0F);
        Sup17 = new ModelRenderer(this, 41, 14);
        Sup17.addBox(-6.5F, -5.5F, -5F, 13, 1, 1);
        Sup17.setRotationPoint(0F, 23F, 0F);
        Sup17.setTextureSize(128, 128);
        Sup17.mirror = true;
        ATGUtils.setRotation(Sup17, 0F, 0F, 0F);
        Sup18 = new ModelRenderer(this, 6, 47);
        Sup18.addBox(-1F, -0.5F, -1.2F, 2, 1, 1);
        Sup18.setRotationPoint(0F, 17F, -4F);
        Sup18.setTextureSize(128, 128);
        Sup18.mirror = true;
        ATGUtils.setRotation(Sup18, 0F, 0F, 0F);
        Sup19 = new ModelRenderer(this, 0, 13);
        Sup19.addBox(-1F, -6.5F, -5F, 2, 1, 1);
        Sup19.setRotationPoint(0F, 23F, 0F);
        Sup19.setTextureSize(128, 128);
        Sup19.mirror = true;
        ATGUtils.setRotation(Sup19, 0F, 0F, 0F);
        Sup20 = new ModelRenderer(this, 110, 0);
        Sup20.addBox(-0.5F, -1.5F, -1.25F, 1, 3, 1);
        Sup20.setRotationPoint(0F, 17F, -4F);
        Sup20.setTextureSize(128, 128);
        Sup20.mirror = true;
        ATGUtils.setRotation(Sup20, 0F, 0F, 0.7853982F);
        Sup21 = new ModelRenderer(this, 0, 13);
        Sup21.addBox(-4.5F, -6.5F, -5F, 2, 1, 1);
        Sup21.setRotationPoint(0F, 23F, 0F);
        Sup21.setTextureSize(128, 128);
        Sup21.mirror = true;
        ATGUtils.setRotation(Sup21, 0F, 0F, 0F);
        Sup22 = new ModelRenderer(this, 110, 0);
        Sup22.addBox(-1.5F, -0.5F, -1.25F, 3, 1, 1);
        Sup22.setRotationPoint(-3.5F, 17F, -4F);
        Sup22.setTextureSize(128, 128);
        Sup22.mirror = true;
        ATGUtils.setRotation(Sup22, 0F, 0F, 0.7853982F);
        Sup23 = new ModelRenderer(this, 110, 0);
        Sup23.addBox(-1.5F, -0.5F, -1.25F, 3, 1, 1);
        Sup23.setRotationPoint(0F, 17F, -4F);
        Sup23.setTextureSize(128, 128);
        Sup23.mirror = true;
        ATGUtils.setRotation(Sup23, 0F, 0F, 0.7853982F);
        Sup24 = new ModelRenderer(this, 110, 0);
        Sup24.addBox(-0.5F, -1.5F, -1.25F, 1, 3, 1);
        Sup24.setRotationPoint(3.5F, 17F, -4F);
        Sup24.setTextureSize(128, 128);
        Sup24.mirror = true;
        ATGUtils.setRotation(Sup24, 0F, 0F, 0.7853982F);
        Sup25 = new ModelRenderer(this, 0, 52);
        Sup25.addBox(-0.5F, -0.5F, -1.3F, 1, 1, 1);
        Sup25.setRotationPoint(-3.5F, 17F, -4F);
        Sup25.setTextureSize(128, 128);
        Sup25.mirror = true;
        ATGUtils.setRotation(Sup25, 0F, 0F, 0.7853982F);
        Sup26 = new ModelRenderer(this, 0, 52);
        Sup26.addBox(-0.5F, -0.5F, -1.3F, 1, 1, 1);
        Sup26.setRotationPoint(0F, 17F, -4F);
        Sup26.setTextureSize(128, 128);
        Sup26.mirror = true;
        ATGUtils.setRotation(Sup26, 0F, 0F, 0.7853982F);
        Sup27 = new ModelRenderer(this, 0, 52);
        Sup27.addBox(-0.5F, -0.5F, -1.3F, 1, 1, 1);
        Sup27.setRotationPoint(3.5F, 17F, -4F);
        Sup27.setTextureSize(128, 128);
        Sup27.mirror = true;
        ATGUtils.setRotation(Sup27, 0F, 0F, 0.7853982F);
        Sup28 = new ModelRenderer(this, 0, 47);
        Sup28.addBox(-0.5F, -1F, -1.2F, 1, 2, 1);
        Sup28.setRotationPoint(3.5F, 17F, -4F);
        Sup28.setTextureSize(128, 128);
        Sup28.mirror = true;
        ATGUtils.setRotation(Sup28, 0F, 0F, 0F);
        Sup29 = new ModelRenderer(this, 0, 47);
        Sup29.addBox(-0.5F, -1F, -1.2F, 1, 2, 1);
        Sup29.setRotationPoint(0F, 17F, -4F);
        Sup29.setTextureSize(128, 128);
        Sup29.mirror = true;
        ATGUtils.setRotation(Sup29, 0F, 0F, 0F);
        Sup30 = new ModelRenderer(this, 0, 47);
        Sup30.addBox(-0.5F, -1F, -1.2F, 1, 2, 1);
        Sup30.setRotationPoint(-3.5F, 17F, -4F);
        Sup30.setTextureSize(128, 128);
        Sup30.mirror = true;
        ATGUtils.setRotation(Sup30, 0F, 0F, 0F);
        Sup31 = new ModelRenderer(this, 110, 0);
        Sup31.addBox(-1.5F, -0.5F, -1.25F, 3, 1, 1);
        Sup31.setRotationPoint(3.5F, 17F, -4F);
        Sup31.setTextureSize(128, 128);
        Sup31.mirror = true;
        ATGUtils.setRotation(Sup31, 0F, 0F, 0.7853982F);
    }
    
    @Override
    public void render(float scale) {
        MS1.render(scale);
        insert_name.render(scale);
        MS3.render(scale);
        MS4.render(scale);
        MS5.render(scale);
        MS6.render(scale);
        MS7.render(scale);
        MS8.render(scale);
        MS9.render(scale);
        MS10.render(scale);
        MS11.render(scale);
        ST11.render(scale);
        MS13.render(scale);
        MS14.render(scale);
        ST1.render(scale);
        ST2.render(scale);
        ST3.render(scale);
        ST4.render(scale);
        ST5.render(scale);
        ST6.render(scale);
        ST7.render(scale);
        ST8.render(scale);
        ST9.render(scale);
        ST10.render(scale);
        stwhatthough.render(scale);
        ST12.render(scale);
        ST13.render(scale);
        ST14.render(scale);
        ST15.render(scale);
        ST16.render(scale);
        ST17.render(scale);
        ST18.render(scale);
        ST19.render(scale);
        Tas1.render(scale);
        Tas2.render(scale);
        Sup1.render(scale);
        Sup2.render(scale);
        Sup3.render(scale);
        Sup4.render(scale);
        Sup5.render(scale);
        Sup6.render(scale);
        Sup7.render(scale);
        Sup8.render(scale);
        Sup9.render(scale);
        Sup10.render(scale);
        Sup11.render(scale);
        Sup12.render(scale);
        Sup13.render(scale);
        Sup14.render(scale);
        Sup15.render(scale);
        Sup16.render(scale);
        Sup17.render(scale);
        Sup18.render(scale);
        Sup19.render(scale);
        Sup20.render(scale);
        Sup21.render(scale);
        Sup22.render(scale);
        Sup23.render(scale);
        Sup24.render(scale);
        Sup25.render(scale);
        Sup26.render(scale);
        Sup27.render(scale);
        Sup28.render(scale);
        Sup29.render(scale);
        Sup30.render(scale);
        Sup31.render(scale);
    }

    @Override
    public ResourceLocation getTexture() {
        return TEX;
    }
}
