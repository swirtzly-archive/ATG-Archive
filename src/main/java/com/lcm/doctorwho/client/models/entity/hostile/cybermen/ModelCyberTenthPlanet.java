package com.lcm.doctorwho.client.models.entity.hostile.cybermen;

import com.lcm.doctorwho.AcrossTheGalaxy;
import com.lcm.doctorwho.client.models.interfaces.BodyPartHook;
import com.lcm.doctorwho.utils.ATGUtils;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelCyberTenthPlanet extends ModelBiped {
	private ResourceLocation TEX = new ResourceLocation(AcrossTheGalaxy.MODID, "textures/entity/cybermen/tenth_planet.png");

	ModelRenderer Head1;
	ModelRenderer Head2;
	ModelRenderer Head3;
	ModelRenderer Head4;
	ModelRenderer Head5;
	ModelRenderer Head6;
	ModelRenderer Head7;
	ModelRenderer Head8;
	ModelRenderer Head9;
	ModelRenderer Head10;
	ModelRenderer Head11;
	ModelRenderer Head12;
	ModelRenderer Head13;
	ModelRenderer Head14;
	ModelRenderer Head15;
	ModelRenderer Head16;
	ModelRenderer Head17;
	ModelRenderer Head18;
	ModelRenderer Head19;
	ModelRenderer Head20;
	ModelRenderer Head21;
	ModelRenderer Head22;
	ModelRenderer Head23;
	ModelRenderer Head24;
	ModelRenderer Head25;
	ModelRenderer Head26;
	ModelRenderer Head27;
	ModelRenderer Head28;
	ModelRenderer Head29;
	ModelRenderer Head30;
	ModelRenderer Head31;
	ModelRenderer Head32;
	ModelRenderer Head33;
	ModelRenderer Head34;
	ModelRenderer Head35;
	ModelRenderer Head36;
	ModelRenderer Head37;
	ModelRenderer Head38;
	ModelRenderer Head39;
	ModelRenderer Head40;
	ModelRenderer Head41;
	ModelRenderer Head42;
	ModelRenderer Head43;
	ModelRenderer Head44;
	ModelRenderer Head45;
	ModelRenderer Head46;
	ModelRenderer Torso1;
	ModelRenderer Torso2;
	ModelRenderer Torso3;
	ModelRenderer Torso4;
	ModelRenderer Torso5;
	ModelRenderer Torso6;
	ModelRenderer Torso7;
	ModelRenderer Torso8;
	ModelRenderer Torso9;
	ModelRenderer Torso10;
	ModelRenderer Torso11;
	ModelRenderer Torso12;
	ModelRenderer Torso13;
	ModelRenderer Torso14;
	ModelRenderer Torso15;
	ModelRenderer Torso16;
	ModelRenderer Gun1;
	ModelRenderer Gun2;
	ModelRenderer Gun3;
	ModelRenderer Gun4;
	ModelRenderer Gun5;
	ModelRenderer Gun6;
	ModelRenderer Gun7;
	ModelRenderer Gun8;
	ModelRenderer Gun9;
	ModelRenderer Gun10;
	ModelRenderer Gun11;
	ModelRenderer Gun12;
	ModelRenderer Gun13;
	ModelRenderer Gun14;
	ModelRenderer Gun15;
	ModelRenderer Gun16;
	ModelRenderer Gun17;
	ModelRenderer RightArm1;
	ModelRenderer RightArm2;
	ModelRenderer RightArm3;
	ModelRenderer RightArm4;
	ModelRenderer RightArm5;
	ModelRenderer RightArm6;
	ModelRenderer RightArm7;
	ModelRenderer RightArm8;
	ModelRenderer LeftArm1;
	ModelRenderer LeftArm2;
	ModelRenderer LeftArm3;
	ModelRenderer LeftArm4;
	ModelRenderer LeftArm5;
	ModelRenderer LeftArm6;
	ModelRenderer LeftArm7;
	ModelRenderer LeftArm8;
	ModelRenderer RightLeg1;
	ModelRenderer RightLeg2;
	ModelRenderer RightLeg3;
	ModelRenderer RightLeg4;
	ModelRenderer RightLeg5;
	ModelRenderer RightLeg6;
	ModelRenderer RightLeg7;
	ModelRenderer LeftLeg1;
	ModelRenderer LeftLeg2;
	ModelRenderer LeftLeg3;
	ModelRenderer LeftLeg4;
	ModelRenderer LeftLeg5;
	ModelRenderer LeftLeg6;
	ModelRenderer LeftLeg7;

	public ModelCyberTenthPlanet() {
		textureWidth = 128;
		textureHeight = 128;

		Head1 = new ModelRenderer(this, 32, 0);
		Head1.addBox(4.8F, -10F, -0.5F, 1, 7, 1);
		Head1.setRotationPoint(0F, 0F, 0F);
		Head1.setTextureSize(128, 128);
		Head1.mirror = true;
		setRotation(Head1, 0F, 0F, 0F);
		Head2 = new ModelRenderer(this, 36, 0);
		Head2.addBox(1F, -4.5F, -4.1F, 2, 1, 1);
		Head2.setRotationPoint(0F, 0F, 0F);
		Head2.setTextureSize(128, 128);
		Head2.mirror = true;
		setRotation(Head2, 0F, 0F, 0F);
		Head3 = new ModelRenderer(this, 36, 2);
		Head3.addBox(-0.5F, 0F, 0F, 1, 2, 1);
		Head3.setRotationPoint(0F, -4F, -4F);
		Head3.setTextureSize(128, 128);
		Head3.mirror = true;
		setRotation(Head3, -0.122173F, 0F, 0F);
		Head4 = new ModelRenderer(this, 36, 0);
		Head4.addBox(-3F, -4.5F, -4.1F, 2, 1, 1);
		Head4.setRotationPoint(0F, 0F, 0F);
		Head4.setTextureSize(128, 128);
		Head4.mirror = true;
		setRotation(Head4, 0F, 0F, 0F);
		Head5 = new ModelRenderer(this, 36, 5);
		Head5.addBox(-2.2F, -4.3F, -4.2F, 1, 1, 1);
		Head5.setRotationPoint(0F, 0F, 0F);
		Head5.setTextureSize(128, 128);
		Head5.mirror = true;
		setRotation(Head5, 0F, 0F, 0F);
		Head6 = new ModelRenderer(this, 40, 2);
		Head6.addBox(-4F, -7F, 3.2F, 8, 1, 1);
		Head6.setRotationPoint(0F, 0F, 0F);
		Head6.setTextureSize(128, 128);
		Head6.mirror = true;
		setRotation(Head6, 0F, 0F, 0F);
		Head7 = new ModelRenderer(this, 58, 0);
		Head7.addBox(0F, -1F, -1F, 2, 1, 2);
		Head7.setRotationPoint(2F, 0.5F, -3F);
		Head7.setTextureSize(128, 128);
		Head7.mirror = true;
		setRotation(Head7, 0F, 0F, -0.3490659F);
		Head8 = new ModelRenderer(this, 36, 0);
		Head8.addBox(-3F, -4F, -4.1F, 2, 1, 1);
		Head8.setRotationPoint(0F, 0F, 0F);
		Head8.setTextureSize(128, 128);
		Head8.mirror = true;
		setRotation(Head8, 0F, 0F, 0F);
		Head9 = new ModelRenderer(this, 58, 3);
		Head9.addBox(-1.5F, -11.5F, -2.7F, 3, 3, 1);
		Head9.setRotationPoint(0F, 0F, 0F);
		Head9.setTextureSize(128, 128);
		Head9.mirror = true;
		setRotation(Head9, 0F, 0F, 0F);
		Head10 = new ModelRenderer(this, 40, 4);
		Head10.addBox(-2F, -0.5F, -4F, 4, 1, 2);
		Head10.setRotationPoint(0F, 0F, 0F);
		Head10.setTextureSize(128, 128);
		Head10.mirror = true;
		setRotation(Head10, 0F, 0F, 0F);
		Head11 = new ModelRenderer(this, 58, 0);
		Head11.addBox(-2F, -1F, -1F, 2, 1, 2);
		Head11.setRotationPoint(-2F, 0.5F, -3F);
		Head11.setTextureSize(128, 128);
		Head11.mirror = true;
		setRotation(Head11, 0F, 0F, 0.3490659F);
		Head12 = new ModelRenderer(this, 36, 0);
		Head12.addBox(1F, -4F, -4.1F, 2, 1, 1);
		Head12.setRotationPoint(0F, 0F, 0F);
		Head12.setTextureSize(128, 128);
		Head12.mirror = true;
		setRotation(Head12, 0F, 0F, 0F);
		Head13 = new ModelRenderer(this, 54, 0);
		Head13.addBox(-2.2F, -4.2F, -4.25F, 1, 1, 1);
		Head13.setRotationPoint(0F, 0F, 0F);
		Head13.setTextureSize(128, 128);
		Head13.mirror = true;
		setRotation(Head13, 0F, 0F, 0F);
		Head14 = new ModelRenderer(this, 36, 5);
		Head14.addBox(-2.8F, -4.3F, -4.2F, 1, 1, 1);
		Head14.setRotationPoint(0F, 0F, 0F);
		Head14.setTextureSize(128, 128);
		Head14.mirror = true;
		setRotation(Head14, 0F, 0F, 0F);
		Head15 = new ModelRenderer(this, 36, 5);
		Head15.addBox(-2.8F, -4.2F, -4.2F, 1, 1, 1);
		Head15.setRotationPoint(0F, 0F, 0F);
		Head15.setTextureSize(128, 128);
		Head15.mirror = true;
		setRotation(Head15, 0F, 0F, 0F);
		Head16 = new ModelRenderer(this, 36, 5);
		Head16.addBox(1.2F, -4.3F, -4.2F, 1, 1, 1);
		Head16.setRotationPoint(0F, 0F, 0F);
		Head16.setTextureSize(128, 128);
		Head16.mirror = true;
		setRotation(Head16, 0F, 0F, 0F);
		Head17 = new ModelRenderer(this, 36, 5);
		Head17.addBox(1.8F, -4.3F, -4.2F, 1, 1, 1);
		Head17.setRotationPoint(0F, 0F, 0F);
		Head17.setTextureSize(128, 128);
		Head17.mirror = true;
		setRotation(Head17, 0F, 0F, 0F);
		Head18 = new ModelRenderer(this, 36, 5);
		Head18.addBox(1.8F, -4.2F, -4.2F, 1, 1, 1);
		Head18.setRotationPoint(0F, 0F, 0F);
		Head18.setTextureSize(128, 128);
		Head18.mirror = true;
		setRotation(Head18, 0F, 0F, 0F);
		Head19 = new ModelRenderer(this, 54, 0);
		Head19.addBox(1.2F, -4.2F, -4.25F, 1, 1, 1);
		Head19.setRotationPoint(0F, 0F, 0F);
		Head19.setTextureSize(128, 128);
		Head19.mirror = true;
		setRotation(Head19, 0F, 0F, 0F);
		Head20 = new ModelRenderer(this, 42, 0);
		Head20.addBox(-1.5F, -1F, 0F, 3, 1, 1);
		Head20.setRotationPoint(0F, -0.2F, -4.1F);
		Head20.setTextureSize(128, 128);
		Head20.mirror = true;
		setRotation(Head20, -0.1396263F, 0F, 0F);
		Head21 = new ModelRenderer(this, 40, 2);
		Head21.addBox(-4F, -6.5F, 3.2F, 8, 1, 1);
		Head21.setRotationPoint(0F, 0F, 0F);
		Head21.setTextureSize(128, 128);
		Head21.mirror = true;
		setRotation(Head21, 0F, 0F, 0F);
		Head22 = new ModelRenderer(this, 66, 0);
		Head22.addBox(3.2F, -7F, -4F, 1, 1, 8);
		Head22.setRotationPoint(0F, 0F, 0F);
		Head22.setTextureSize(128, 128);
		Head22.mirror = true;
		setRotation(Head22, 0F, 0F, 0F);
		Head23 = new ModelRenderer(this, 66, 0);
		Head23.addBox(3.2F, -6.5F, -4F, 1, 1, 8);
		Head23.setRotationPoint(0F, 0F, 0F);
		Head23.setTextureSize(128, 128);
		Head23.mirror = true;
		setRotation(Head23, 0F, 0F, 0F);
		Head24 = new ModelRenderer(this, 40, 2);
		Head24.addBox(-4F, -7F, -4.2F, 8, 1, 1);
		Head24.setRotationPoint(0F, 0F, 0F);
		Head24.setTextureSize(128, 128);
		Head24.mirror = true;
		setRotation(Head24, 0F, 0F, 0F);
		Head25 = new ModelRenderer(this, 40, 2);
		Head25.addBox(-4F, -6.5F, -4.2F, 8, 1, 1);
		Head25.setRotationPoint(0F, 0F, 0F);
		Head25.setTextureSize(128, 128);
		Head25.mirror = true;
		setRotation(Head25, 0F, 0F, 0F);
		Head26 = new ModelRenderer(this, 66, 0);
		Head26.addBox(-4.2F, -7F, -4F, 1, 1, 8);
		Head26.setRotationPoint(0F, 0F, 0F);
		Head26.setTextureSize(128, 128);
		Head26.mirror = true;
		setRotation(Head26, 0F, 0F, 0F);
		Head27 = new ModelRenderer(this, 66, 0);
		Head27.addBox(-4.2F, -6.5F, -4F, 1, 1, 8);
		Head27.setRotationPoint(0F, 0F, 0F);
		Head27.setTextureSize(128, 128);
		Head27.mirror = true;
		setRotation(Head27, 0F, 0F, 0F);
		Head28 = new ModelRenderer(this, 32, 12);
		Head28.addBox(-5F, -4F, -1F, 10, 2, 2);
		Head28.setRotationPoint(0F, 0F, 0F);
		Head28.setTextureSize(128, 128);
		Head28.mirror = true;
		setRotation(Head28, 0F, 0F, 0F);
		Head29 = new ModelRenderer(this, 52, 4);
		Head29.addBox(-0.5F, -10F, 3F, 1, 2, 1);
		Head29.setRotationPoint(0F, 0F, 0F);
		Head29.setTextureSize(128, 128);
		Head29.mirror = true;
		setRotation(Head29, 0F, 0F, 0F);
		Head30 = new ModelRenderer(this, 32, 0);
		Head30.addBox(-5.8F, -10F, -0.5F, 1, 7, 1);
		Head30.setRotationPoint(0F, 0F, 0F);
		Head30.setTextureSize(128, 128);
		Head30.mirror = true;
		setRotation(Head30, 0F, 0F, 0F);
		Head31 = new ModelRenderer(this, 0, 0);
		Head31.addBox(-4F, -8F, -4F, 8, 8, 8);
		Head31.setRotationPoint(0F, 0F, 0F);
		Head31.setTextureSize(128, 128);
		Head31.mirror = true;
		setRotation(Head31, 0F, 0F, 0F);
		Head32 = new ModelRenderer(this, 84, 0);
		Head32.addBox(-2F, -11.5F, -2.5F, 4, 3, 5);
		Head32.setRotationPoint(0F, 0F, 0F);
		Head32.setTextureSize(128, 128);
		Head32.mirror = true;
		setRotation(Head32, 0F, 0F, 0F);
		Head33 = new ModelRenderer(this, 102, 0);
		Head33.addBox(-1.5F, -12F, -2.5F, 3, 4, 5);
		Head33.setRotationPoint(0F, 0F, 0F);
		Head33.setTextureSize(128, 128);
		Head33.mirror = true;
		setRotation(Head33, 0F, 0F, 0F);
		Head34 = new ModelRenderer(this, 32, 10);
		Head34.addBox(-5.5F, -10.5F, -0.3F, 11, 1, 1);
		Head34.setRotationPoint(0F, 0F, 0F);
		Head34.setTextureSize(128, 128);
		Head34.mirror = true;
		setRotation(Head34, 0F, 0F, 0F);
		Head35 = new ModelRenderer(this, 50, 0);
		Head35.addBox(-0.5F, -10.5F, 2.5F, 1, 1, 1);
		Head35.setRotationPoint(0F, 0F, 0F);
		Head35.setTextureSize(128, 128);
		Head35.mirror = true;
		setRotation(Head35, 0F, 0F, 0F);
		Head36 = new ModelRenderer(this, 32, 8);
		Head36.addBox(-5.5F, -10.7F, -0.5F, 11, 1, 1);
		Head36.setRotationPoint(0F, 0F, 0F);
		Head36.setTextureSize(128, 128);
		Head36.mirror = true;
		setRotation(Head36, 0F, 0F, 0F);
		Head37 = new ModelRenderer(this, 32, 8);
		Head37.addBox(-5.5F, -10.3F, -0.5F, 11, 1, 1);
		Head37.setRotationPoint(0F, 0F, 0F);
		Head37.setTextureSize(128, 128);
		Head37.mirror = true;
		setRotation(Head37, 0F, 0F, 0F);
		Head38 = new ModelRenderer(this, 32, 10);
		Head38.addBox(-5.5F, -10.5F, -0.7F, 11, 1, 1);
		Head38.setRotationPoint(0F, 0F, 0F);
		Head38.setTextureSize(128, 128);
		Head38.mirror = true;
		setRotation(Head38, 0F, 0F, 0F);
		Head39 = new ModelRenderer(this, 56, 7);
		Head39.addBox(5F, -10.5F, -0.5F, 1, 8, 1);
		Head39.setRotationPoint(0F, 0F, 0F);
		Head39.setTextureSize(128, 128);
		Head39.mirror = true;
		setRotation(Head39, 0F, 0F, 0F);
		Head40 = new ModelRenderer(this, 60, 7);
		Head40.addBox(5F, -10F, -0.3F, 1, 7, 1);
		Head40.setRotationPoint(0F, 0F, 0F);
		Head40.setTextureSize(128, 128);
		Head40.mirror = true;
		setRotation(Head40, 0F, 0F, 0F);
		Head41 = new ModelRenderer(this, 32, 0);
		Head41.addBox(5.2F, -10F, -0.5F, 1, 7, 1);
		Head41.setRotationPoint(0F, 0F, 0F);
		Head41.setTextureSize(128, 128);
		Head41.mirror = true;
		setRotation(Head41, 0F, 0F, 0F);
		Head42 = new ModelRenderer(this, 60, 7);
		Head42.addBox(5F, -10F, -0.7F, 1, 7, 1);
		Head42.setRotationPoint(0F, 0F, 0F);
		Head42.setTextureSize(128, 128);
		Head42.mirror = true;
		setRotation(Head42, 0F, 0F, 0F);
		Head43 = new ModelRenderer(this, 56, 7);
		Head43.addBox(-6F, -10.5F, -0.5F, 1, 8, 1);
		Head43.setRotationPoint(0F, 0F, 0F);
		Head43.setTextureSize(128, 128);
		Head43.mirror = true;
		setRotation(Head43, 0F, 0F, 0F);
		Head44 = new ModelRenderer(this, 60, 7);
		Head44.addBox(-6F, -10F, -0.7F, 1, 7, 1);
		Head44.setRotationPoint(0F, 0F, 0F);
		Head44.setTextureSize(128, 128);
		Head44.mirror = true;
		setRotation(Head44, 0F, 0F, 0F);
		Head45 = new ModelRenderer(this, 60, 7);
		Head45.addBox(-6F, -10F, -0.3F, 1, 7, 1);
		Head45.setRotationPoint(0F, 0F, 0F);
		Head45.setTextureSize(128, 128);
		Head45.mirror = true;
		setRotation(Head45, 0F, 0F, 0F);
		Head46 = new ModelRenderer(this, 32, 0);
		Head46.addBox(-6.2F, -10F, -0.5F, 1, 7, 1);
		Head46.setRotationPoint(0F, 0F, 0F);
		Head46.setTextureSize(128, 128);
		Head46.mirror = true;
		setRotation(Head46, 0F, 0F, 0F);
		Torso1 = new ModelRenderer(this, 16, 32);
		Torso1.addBox(-1F, 6.75F, -3.7F, 2, 1, 1);
		Torso1.setRotationPoint(0F, 0F, 0F);
		Torso1.setTextureSize(128, 128);
		Torso1.mirror = true;
		setRotation(Torso1, 0F, 0F, 0F);
		Torso2 = new ModelRenderer(this, 16, 16);
		Torso2.addBox(-4F, 0F, -2F, 8, 12, 4);
		Torso2.setRotationPoint(0F, 0F, 0F);
		Torso2.setTextureSize(128, 128);
		Torso2.mirror = true;
		setRotation(Torso2, 0F, 0F, 0F);
		Torso3 = new ModelRenderer(this, 16, 34);
		Torso3.addBox(-1F, -1F, -3F, 1, 1, 1);
		Torso3.setRotationPoint(2F, 7F, 0F);
		Torso3.setTextureSize(128, 128);
		Torso3.mirror = true;
		setRotation(Torso3, 0F, 0F, -0.7853982F);
		Torso4 = new ModelRenderer(this, 20, 34);
		Torso4.addBox(-1F, 2.5F, -3.7F, 2, 4, 1);
		Torso4.setRotationPoint(0F, 0F, 0F);
		Torso4.setTextureSize(128, 128);
		Torso4.mirror = true;
		setRotation(Torso4, 0F, 0F, 0F);
		Torso5 = new ModelRenderer(this, 16, 44);
		Torso5.addBox(-3F, 4.5F, -2.5F, 6, 1, 1);
		Torso5.setRotationPoint(0F, 0F, 0F);
		Torso5.setTextureSize(128, 128);
		Torso5.mirror = true;
		setRotation(Torso5, 0F, 0F, 0F);
		Torso6 = new ModelRenderer(this, 16, 34);
		Torso6.addBox(-1F, 0F, -3F, 1, 1, 1);
		Torso6.setRotationPoint(2F, 3F, 0F);
		Torso6.setTextureSize(128, 128);
		Torso6.mirror = true;
		setRotation(Torso6, 0F, 0F, 0.7853982F);
		Torso7 = new ModelRenderer(this, 16, 34);
		Torso7.addBox(0F, -1F, -3F, 1, 1, 1);
		Torso7.setRotationPoint(-2F, 7F, 0F);
		Torso7.setTextureSize(128, 128);
		Torso7.mirror = true;
		setRotation(Torso7, 0F, 0F, 0.7853982F);
		Torso8 = new ModelRenderer(this, 16, 34);
		Torso8.addBox(0F, 0F, -3F, 1, 1, 1);
		Torso8.setRotationPoint(-2F, 3F, 0F);
		Torso8.setTextureSize(128, 128);
		Torso8.mirror = true;
		setRotation(Torso8, 0F, 0F, -0.7853982F);
		Torso9 = new ModelRenderer(this, 26, 32);
		Torso9.addBox(-2F, 3F, -3F, 4, 4, 1);
		Torso9.setRotationPoint(0F, 0F, 0F);
		Torso9.setTextureSize(128, 128);
		Torso9.mirror = true;
		setRotation(Torso9, 0F, 0F, 0F);
		Torso10 = new ModelRenderer(this, 28, 35);
		Torso10.addBox(3.5F, 2F, -3.5F, 0, 6, 2);
		Torso10.setRotationPoint(0F, 0F, 0F);
		Torso10.setTextureSize(128, 128);
		Torso10.mirror = true;
		setRotation(Torso10, 0F, 0F, 0F);
		Torso11 = new ModelRenderer(this, 16, 44);
		Torso11.addBox(-3F, 6F, -2.5F, 6, 1, 1);
		Torso11.setRotationPoint(0F, 0F, 0F);
		Torso11.setTextureSize(128, 128);
		Torso11.mirror = true;
		setRotation(Torso11, 0F, 0F, 0F);
		Torso12 = new ModelRenderer(this, 16, 44);
		Torso12.addBox(-3F, 3F, -2.5F, 6, 1, 1);
		Torso12.setRotationPoint(0F, 0F, 0F);
		Torso12.setTextureSize(128, 128);
		Torso12.mirror = true;
		setRotation(Torso12, 0F, 0F, 0F);
		Torso13 = new ModelRenderer(this, 28, 35);
		Torso13.addBox(-3.5F, 2F, -3.5F, 0, 6, 2);
		Torso13.setRotationPoint(0F, 0F, 0F);
		Torso13.setTextureSize(128, 128);
		Torso13.mirror = true;
		setRotation(Torso13, 0F, 0F, 0F);
		Torso14 = new ModelRenderer(this, 16, 46);
		Torso14.addBox(-3.5F, 7.9F, -3.5F, 7, 0, 2);
		Torso14.setRotationPoint(0F, 0F, 0F);
		Torso14.setTextureSize(128, 128);
		Torso14.mirror = true;
		setRotation(Torso14, 0F, 0F, 0F);
		Torso15 = new ModelRenderer(this, 32, 37);
		Torso15.addBox(-1.5F, 2F, -3.5F, 3, 6, 2);
		Torso15.setRotationPoint(0F, 0F, 0F);
		Torso15.setTextureSize(128, 128);
		Torso15.mirror = true;
		setRotation(Torso15, 0F, 0F, 0F);
		Torso16 = new ModelRenderer(this, 16, 46);
		Torso16.addBox(-3.5F, 2F, -3.5F, 7, 0, 2);
		Torso16.setRotationPoint(0F, 0F, 0F);
		Torso16.setTextureSize(128, 128);
		Torso16.mirror = true;
		setRotation(Torso16, 0F, 0F, 0F);
		Gun1 = new ModelRenderer(this, 16, 39);
		Gun1.addBox(-2F, 9F, -4F, 4, 3, 2);
		Gun1.setRotationPoint(0F, 0F, 0F);
		Gun1.setTextureSize(128, 128);
		Gun1.mirror = true;
		setRotation(Gun1, 0F, 0F, 0F);
		Gun2 = new ModelRenderer(this, 36, 32);
		Gun2.addBox(0F, -2F, -1.2F, 0, 4, 1);
		Gun2.setRotationPoint(0F, 10.5F, -3F);
		Gun2.setTextureSize(128, 128);
		Gun2.mirror = true;
		setRotation(Gun2, 0F, 0F, 2.356194F);
		Gun3 = new ModelRenderer(this, 16, 56);
		Gun3.addBox(-3.5F, 11F, -2.7F, 7, 0, 1);
		Gun3.setRotationPoint(0F, 0F, 0F);
		Gun3.setTextureSize(128, 128);
		Gun3.mirror = true;
		setRotation(Gun3, 0F, 0F, 0F);
		Gun4 = new ModelRenderer(this, 22, 32);
		Gun4.addBox(-0.5F, 10F, -4.3F, 1, 1, 1);
		Gun4.setRotationPoint(0F, 0F, 0F);
		Gun4.setTextureSize(128, 128);
		Gun4.mirror = true;
		setRotation(Gun4, 0F, 0F, 0F);
		Gun5 = new ModelRenderer(this, 36, 32);
		Gun5.addBox(0F, -2F, -1.2F, 0, 4, 1);
		Gun5.setRotationPoint(0F, 10.5F, -3F);
		Gun5.setTextureSize(128, 128);
		Gun5.mirror = true;
		setRotation(Gun5, 0F, 0F, 0F);
		Gun6 = new ModelRenderer(this, 36, 32);
		Gun6.addBox(0F, -2F, -1.2F, 0, 4, 1);
		Gun6.setRotationPoint(0F, 10.5F, -3F);
		Gun6.setTextureSize(128, 128);
		Gun6.mirror = true;
		setRotation(Gun6, 0F, 0F, 0.7853982F);
		Gun7 = new ModelRenderer(this, 36, 32);
		Gun7.addBox(0F, -2F, -1.2F, 0, 4, 1);
		Gun7.setRotationPoint(0F, 10.5F, -3F);
		Gun7.setTextureSize(128, 128);
		Gun7.mirror = true;
		setRotation(Gun7, 0F, 0F, 1.570796F);
		Gun8 = new ModelRenderer(this, 16, 48);
		Gun8.addBox(-1.5F, 8.5F, -4F, 3, 4, 2);
		Gun8.setRotationPoint(0F, 0F, 0F);
		Gun8.setTextureSize(128, 128);
		Gun8.mirror = true;
		setRotation(Gun8, 0F, 0F, 0F);
		Gun9 = new ModelRenderer(this, 16, 36);
		Gun9.addBox(3.5F, -2F, 0F, 1, 2, 1);
		Gun9.setRotationPoint(0F, 12F, -3.7F);
		Gun9.setTextureSize(128, 128);
		Gun9.mirror = true;
		setRotation(Gun9, -0.7853982F, 0F, 0F);
		Gun10 = new ModelRenderer(this, 26, 48);
		Gun10.addBox(-4.5F, 12F, -3.7F, 9, 1, 1);
		Gun10.setRotationPoint(0F, 0F, 0F);
		Gun10.setTextureSize(128, 128);
		Gun10.mirror = true;
		setRotation(Gun10, 0F, 0F, 0F);
		Gun11 = new ModelRenderer(this, 34, 45);
		Gun11.addBox(-4.5F, 9.5F, -2.7F, 1, 2, 1);
		Gun11.setRotationPoint(0F, 0F, 0F);
		Gun11.setTextureSize(128, 128);
		Gun11.mirror = true;
		setRotation(Gun11, 0F, 0F, 0F);
		Gun12 = new ModelRenderer(this, 26, 48);
		Gun12.addBox(-4.5F, 8F, -3.7F, 9, 1, 1);
		Gun12.setRotationPoint(0F, 0F, 0F);
		Gun12.setTextureSize(128, 128);
		Gun12.mirror = true;
		setRotation(Gun12, 0F, 0F, 0F);
		Gun13 = new ModelRenderer(this, 16, 36);
		Gun13.addBox(-4.5F, -2F, 0F, 1, 2, 1);
		Gun13.setRotationPoint(0F, 12F, -3.7F);
		Gun13.setTextureSize(128, 128);
		Gun13.mirror = true;
		setRotation(Gun13, -0.7853982F, 0F, 0F);
		Gun14 = new ModelRenderer(this, 16, 36);
		Gun14.addBox(3.5F, 0F, 0F, 1, 2, 1);
		Gun14.setRotationPoint(0F, 9F, -3.7F);
		Gun14.setTextureSize(128, 128);
		Gun14.mirror = true;
		setRotation(Gun14, 0.7853982F, 0F, 0F);
		Gun15 = new ModelRenderer(this, 16, 36);
		Gun15.addBox(-4.5F, 0F, 0F, 1, 2, 1);
		Gun15.setRotationPoint(0F, 9F, -3.7F);
		Gun15.setTextureSize(128, 128);
		Gun15.mirror = true;
		setRotation(Gun15, 0.7853982F, 0F, 0F);
		Gun16 = new ModelRenderer(this, 34, 45);
		Gun16.addBox(3.5F, 9.5F, -2.7F, 1, 2, 1);
		Gun16.setRotationPoint(0F, 0F, 0F);
		Gun16.setTextureSize(128, 128);
		Gun16.mirror = true;
		setRotation(Gun16, 0F, 0F, 0F);
		Gun17 = new ModelRenderer(this, 16, 56);
		Gun17.addBox(-3.5F, 10F, -2.7F, 7, 0, 1);
		Gun17.setRotationPoint(0F, 0F, 0F);
		Gun17.setTextureSize(128, 128);
		Gun17.mirror = true;
		setRotation(Gun17, 0F, 0F, 0F);
		RightArm1 = new ModelRenderer(this, 26, 50);
		RightArm1.addBox(-2.5F, -2.5F, -2.5F, 4, 1, 5);
		RightArm1.setRotationPoint(-5F, 2F, 0F);
		RightArm1.setTextureSize(128, 128);
		RightArm1.mirror = true;
		setRotation(RightArm1, 0F, 0F, -0.1745329F);
		RightArm2 = new ModelRenderer(this, 0, 32);
		RightArm2.addBox(-2.5F, 3.5F, -2F, 1, 1, 4);
		RightArm2.setRotationPoint(-5F, 2F, 0F);
		RightArm2.setTextureSize(128, 128);
		RightArm2.mirror = true;
		setRotation(RightArm2, 0F, 0F, 0F);
		RightArm3 = new ModelRenderer(this, 40, 16);
		RightArm3.addBox(-2F, -2F, -2F, 3, 12, 4);
		RightArm3.setRotationPoint(-5F, 2F, 0F);
		RightArm3.setTextureSize(128, 128);
		RightArm3.mirror = true;
		setRotation(RightArm3, 0F, 0F, 0F);
		RightArm4 = new ModelRenderer(this, 0, 32);
		RightArm4.addBox(-2.5F, 1F, -2F, 1, 1, 4);
		RightArm4.setRotationPoint(-5F, 2F, 0F);
		RightArm4.setTextureSize(128, 128);
		RightArm4.mirror = true;
		setRotation(RightArm4, 0F, 0F, 0F);
		RightArm5 = new ModelRenderer(this, 0, 32);
		RightArm5.addBox(-2.5F, 7F, -2F, 1, 1, 4);
		RightArm5.setRotationPoint(-5F, 2F, 0F);
		RightArm5.setTextureSize(128, 128);
		RightArm5.mirror = true;
		setRotation(RightArm5, 0F, 0F, 0F);
		RightArm6 = new ModelRenderer(this, 54, 16);
		RightArm6.addBox(-2F, 3.5F, -2.5F, 3, 1, 5);
		RightArm6.setRotationPoint(-5F, 2F, 0F);
		RightArm6.setTextureSize(128, 128);
		RightArm6.mirror = true;
		setRotation(RightArm6, 0F, 0F, 0F);
		RightArm7 = new ModelRenderer(this, 54, 16);
		RightArm7.addBox(-2F, 1F, -2.5F, 3, 1, 5);
		RightArm7.setRotationPoint(-5F, 2F, 0F);
		RightArm7.setTextureSize(128, 128);
		RightArm7.mirror = true;
		setRotation(RightArm7, 0F, 0F, 0F);
		RightArm8 = new ModelRenderer(this, 54, 16);
		RightArm8.addBox(-2F, 7F, -2.5F, 3, 1, 5);
		RightArm8.setRotationPoint(-5F, 2F, 0F);
		RightArm8.setTextureSize(128, 128);
		RightArm8.mirror = true;
		setRotation(RightArm8, 0F, 0F, 0F);
		LeftArm1 = new ModelRenderer(this, 0, 32);
		LeftArm1.addBox(1.5F, 3.5F, -2F, 1, 1, 4);
		LeftArm1.setRotationPoint(5F, 2F, 0F);
		LeftArm1.setTextureSize(128, 128);
		LeftArm1.mirror = true;
		setRotation(LeftArm1, 0F, 0F, 0F);
		LeftArm2 = new ModelRenderer(this, 40, 16);
		LeftArm2.addBox(-1F, -2F, -2F, 3, 12, 4);
		LeftArm2.setRotationPoint(5F, 2F, 0F);
		LeftArm2.setTextureSize(128, 128);
		LeftArm2.mirror = true;
		setRotation(LeftArm2, 0F, 0F, 0F);
		LeftArm2.mirror = false;
		LeftArm3 = new ModelRenderer(this, 54, 16);
		LeftArm3.addBox(-1F, 3.5F, -2.5F, 3, 1, 5);
		LeftArm3.setRotationPoint(5F, 2F, 0F);
		LeftArm3.setTextureSize(128, 128);
		LeftArm3.mirror = true;
		setRotation(LeftArm3, 0F, 0F, 0F);
		LeftArm4 = new ModelRenderer(this, 54, 16);
		LeftArm4.addBox(-1F, 7F, -2.5F, 3, 1, 5);
		LeftArm4.setRotationPoint(5F, 2F, 0F);
		LeftArm4.setTextureSize(128, 128);
		LeftArm4.mirror = true;
		setRotation(LeftArm4, 0F, 0F, 0F);
		LeftArm5 = new ModelRenderer(this, 0, 32);
		LeftArm5.addBox(1.5F, 7F, -2F, 1, 1, 4);
		LeftArm5.setRotationPoint(5F, 2F, 0F);
		LeftArm5.setTextureSize(128, 128);
		LeftArm5.mirror = true;
		setRotation(LeftArm5, 0F, 0F, 0F);
		LeftArm6 = new ModelRenderer(this, 26, 50);
		LeftArm6.addBox(-1.5F, -2.5F, -2.5F, 4, 1, 5);
		LeftArm6.setRotationPoint(5F, 2F, 0F);
		LeftArm6.setTextureSize(128, 128);
		LeftArm6.mirror = true;
		setRotation(LeftArm6, 0F, 0F, 0.1745329F);
		LeftArm7 = new ModelRenderer(this, 0, 32);
		LeftArm7.addBox(1.5F, 1F, -2F, 1, 1, 4);
		LeftArm7.setRotationPoint(5F, 2F, 0F);
		LeftArm7.setTextureSize(128, 128);
		LeftArm7.mirror = true;
		setRotation(LeftArm7, 0F, 0F, 0F);
		LeftArm8 = new ModelRenderer(this, 54, 16);
		LeftArm8.addBox(-1F, 1F, -2.5F, 3, 1, 5);
		LeftArm8.setRotationPoint(5F, 2F, 0F);
		LeftArm8.setTextureSize(128, 128);
		LeftArm8.mirror = true;
		setRotation(LeftArm8, 0F, 0F, 0F);
		RightLeg1 = new ModelRenderer(this, 0, 32);
		RightLeg1.addBox(-2.5F, 3.5F, -2F, 1, 1, 4);
		RightLeg1.setRotationPoint(-2F, 12F, 0F);
		RightLeg1.setTextureSize(128, 128);
		RightLeg1.mirror = true;
		setRotation(RightLeg1, 0F, 0F, 0F);
		RightLeg2 = new ModelRenderer(this, 0, 16);
		RightLeg2.addBox(-2F, 0F, -2F, 4, 12, 4);
		RightLeg2.setRotationPoint(-2F, 12F, 0F);
		RightLeg2.setTextureSize(128, 128);
		RightLeg2.mirror = true;
		setRotation(RightLeg2, 0F, 0F, 0F);
		RightLeg3 = new ModelRenderer(this, 0, 37);
		RightLeg3.addBox(-2F, 11F, -3F, 4, 1, 1);
		RightLeg3.setRotationPoint(-2F, 12F, 0F);
		RightLeg3.setTextureSize(128, 128);
		RightLeg3.mirror = true;
		setRotation(RightLeg3, 0F, 0F, 0F);
		RightLeg4 = new ModelRenderer(this, 0, 39);
		RightLeg4.addBox(-2F, 10.5F, -2.5F, 4, 1, 1);
		RightLeg4.setRotationPoint(-2F, 12F, 0F);
		RightLeg4.setTextureSize(128, 128);
		RightLeg4.mirror = true;
		setRotation(RightLeg4, 0F, 0F, 0F);
		RightLeg5 = new ModelRenderer(this, 0, 32);
		RightLeg5.addBox(-2.5F, 8.5F, -2F, 1, 1, 4);
		RightLeg5.setRotationPoint(-2F, 12F, 0F);
		RightLeg5.setTextureSize(128, 128);
		RightLeg5.mirror = true;
		setRotation(RightLeg5, 0F, 0F, 0F);
		RightLeg6 = new ModelRenderer(this, 64, 9);
		RightLeg6.addBox(-2F, 3.5F, -2.5F, 4, 1, 5);
		RightLeg6.setRotationPoint(-2F, 12F, 0F);
		RightLeg6.setTextureSize(128, 128);
		RightLeg6.mirror = true;
		setRotation(RightLeg6, 0F, 0F, 0F);
		RightLeg7 = new ModelRenderer(this, 64, 9);
		RightLeg7.addBox(-2F, 8.5F, -2.5F, 4, 1, 5);
		RightLeg7.setRotationPoint(-2F, 12F, 0F);
		RightLeg7.setTextureSize(128, 128);
		RightLeg7.mirror = true;
		setRotation(RightLeg7, 0F, 0F, 0F);
		LeftLeg1 = new ModelRenderer(this, 0, 32);
		LeftLeg1.addBox(1.5F, 3.5F, -2F, 1, 1, 4);
		LeftLeg1.setRotationPoint(2F, 12F, 0F);
		LeftLeg1.setTextureSize(128, 128);
		LeftLeg1.mirror = true;
		setRotation(LeftLeg1, 0F, 0F, 0F);
		LeftLeg2 = new ModelRenderer(this, 0, 16);
		LeftLeg2.addBox(-2F, 0F, -2F, 4, 12, 4);
		LeftLeg2.setRotationPoint(2F, 12F, 0F);
		LeftLeg2.setTextureSize(128, 128);
		LeftLeg2.mirror = true;
		setRotation(LeftLeg2, 0F, 0F, 0F);
		LeftLeg2.mirror = false;
		LeftLeg3 = new ModelRenderer(this, 0, 37);
		LeftLeg3.addBox(-2F, 11F, -3F, 4, 1, 1);
		LeftLeg3.setRotationPoint(2F, 12F, 0F);
		LeftLeg3.setTextureSize(128, 128);
		LeftLeg3.mirror = true;
		setRotation(LeftLeg3, 0F, 0F, 0F);
		LeftLeg4 = new ModelRenderer(this, 0, 39);
		LeftLeg4.addBox(-2F, 10.5F, -2.5F, 4, 1, 1);
		LeftLeg4.setRotationPoint(2F, 12F, 0F);
		LeftLeg4.setTextureSize(128, 128);
		LeftLeg4.mirror = true;
		setRotation(LeftLeg4, 0F, 0F, 0F);
		LeftLeg5 = new ModelRenderer(this, 0, 32);
		LeftLeg5.addBox(1.5F, 8.5F, -2F, 1, 1, 4);
		LeftLeg5.setRotationPoint(2F, 12F, 0F);
		LeftLeg5.setTextureSize(128, 128);
		LeftLeg5.mirror = true;
		setRotation(LeftLeg5, 0F, 0F, 0F);
		LeftLeg6 = new ModelRenderer(this, 64, 9);
		LeftLeg6.addBox(-2F, 3.5F, -2.5F, 4, 1, 5);
		LeftLeg6.setRotationPoint(2F, 12F, 0F);
		LeftLeg6.setTextureSize(128, 128);
		LeftLeg6.mirror = true;
		setRotation(LeftLeg6, 0F, 0F, 0F);
		LeftLeg7 = new ModelRenderer(this, 64, 9);
		LeftLeg7.addBox(-2F, 8.5F, -2.5F, 4, 1, 5);
		LeftLeg7.setRotationPoint(2F, 12F, 0F);
		LeftLeg7.setTextureSize(128, 128);
		LeftLeg7.mirror = true;
		setRotation(LeftLeg7, 0F, 0F, 0F);

		this.bipedHead = new BodyPartHook(this, 0, 0);
		this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);

		((BodyPartHook) this.bipedHead).setRender(new BodyPartHook.IPartRenderer() {
			@Override
			public void render(float scale) {
				GlStateManager.pushMatrix();
				ATGUtils.bindTexture(TEX);
				GlStateManager.translate(0F, -0.00F, 0F);
				Head1.render(scale);
				Head2.render(scale);
				Head3.render(scale);
				Head4.render(scale);
				Head5.render(scale);
				Head6.render(scale);
				Head7.render(scale);
				Head8.render(scale);
				Head9.render(scale);
				Head10.render(scale);
				Head11.render(scale);
				Head12.render(scale);
				Head13.render(scale);
				Head14.render(scale);
				Head15.render(scale);
				Head16.render(scale);
				Head17.render(scale);
				Head18.render(scale);
				Head19.render(scale);
				Head20.render(scale);
				Head21.render(scale);
				Head22.render(scale);
				Head23.render(scale);
				Head24.render(scale);
				Head25.render(scale);
				Head26.render(scale);
				Head27.render(scale);
				Head28.render(scale);
				Head29.render(scale);
				Head30.render(scale);
				Head31.render(scale);
				Head32.render(scale);
				Head33.render(scale);
				Head34.render(scale);
				Head35.render(scale);
				Head36.render(scale);
				Head37.render(scale);
				Head38.render(scale);
				Head39.render(scale);
				Head40.render(scale);
				Head41.render(scale);
				Head42.render(scale);
				Head43.render(scale);
				Head44.render(scale);
				Head45.render(scale);
				Head46.render(scale);
				GlStateManager.popMatrix();
			}
		});

		bipedBody = new BodyPartHook(this, 16, 16);
		bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);

		((BodyPartHook) bipedBody).setRender(new BodyPartHook.IPartRenderer() {
			@Override
			public void render(float scale) {
				GlStateManager.pushMatrix();
				GlStateManager.translate(0F, -0.05F, 0F);
				ATGUtils.bindTexture(TEX);
				Torso1.render(scale);
				Torso2.render(scale);
				Torso3.render(scale);
				Torso4.render(scale);
				Torso5.render(scale);
				Torso6.render(scale);
				Torso7.render(scale);
				Torso8.render(scale);
				Torso9.render(scale);
				Torso10.render(scale);
				Torso11.render(scale);
				Torso12.render(scale);
				Torso13.render(scale);
				Torso14.render(scale);
				Torso15.render(scale);
				Torso16.render(scale);
				Gun1.render(scale);
				Gun2.render(scale);
				Gun3.render(scale);
				Gun4.render(scale);
				Gun5.render(scale);
				Gun6.render(scale);
				Gun7.render(scale);
				Gun8.render(scale);
				Gun9.render(scale);
				Gun10.render(scale);
				Gun11.render(scale);
				Gun12.render(scale);
				Gun13.render(scale);
				Gun14.render(scale);
				Gun15.render(scale);
				Gun16.render(scale);
				Gun17.render(scale);
				GlStateManager.popMatrix();
			}
		});

		this.bipedLeftArm = new BodyPartHook(this, 40, 16);
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);

		((BodyPartHook) bipedLeftArm).setRender(new BodyPartHook.IPartRenderer() {
			@Override
			public void render(float scale) {
				GlStateManager.pushMatrix();
				GlStateManager.translate(-0.32, -0.05F, 0);
				ATGUtils.bindTexture(TEX);
				LeftArm1.render(scale);
				LeftArm2.render(scale);
				LeftArm3.render(scale);
				LeftArm4.render(scale);
				LeftArm5.render(scale);
				LeftArm6.render(scale);
				LeftArm7.render(scale);
				LeftArm8.render(scale);
				GlStateManager.popMatrix();
			}
		});

		this.bipedRightArm = new BodyPartHook(this, 40, 16);
		this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);

		((BodyPartHook) bipedRightArm).setRender(new BodyPartHook.IPartRenderer() {
			@Override
			public void render(float scale) {
				GlStateManager.pushMatrix();
				GlStateManager.translate(0.32, -0.05F, 0);
				ATGUtils.bindTexture(TEX);
				RightArm1.render(scale);
				RightArm2.render(scale);
				RightArm3.render(scale);
				RightArm4.render(scale);
				RightArm5.render(scale);
				RightArm6.render(scale);
				RightArm7.render(scale);
				RightArm8.render(scale);
				GlStateManager.popMatrix();
			}
		});

		this.bipedRightLeg = new BodyPartHook(this, 0, 16);
		this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);

		((BodyPartHook) bipedRightLeg).setRender(new BodyPartHook.IPartRenderer() {
			@Override
			public void render(float scale) {
				GlStateManager.pushMatrix();
				// Old 0.90
				GlStateManager.translate(0.11, -0.80F, 0F);
				ATGUtils.bindTexture(TEX);
				RightLeg1.render(scale);
				RightLeg2.render(scale);
				RightLeg3.render(scale);
				RightLeg4.render(scale);
				RightLeg5.render(scale);
				RightLeg6.render(scale);
				RightLeg7.render(scale);
				GlStateManager.popMatrix();
			}
		});

		this.bipedLeftLeg = new BodyPartHook(this, 0, 16);
		this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);

		((BodyPartHook) bipedLeftLeg).setRender(new BodyPartHook.IPartRenderer() {
			@Override
			public void render(float scale) {
				GlStateManager.pushMatrix();
				GlStateManager.translate(-0.11, -0.80F, 0F);
				ATGUtils.bindTexture(TEX);
				LeftLeg1.render(scale);
				LeftLeg2.render(scale);
				LeftLeg3.render(scale);
				LeftLeg4.render(scale);
				LeftLeg5.render(scale);
				LeftLeg6.render(scale);
				LeftLeg7.render(scale);
				GlStateManager.popMatrix();
			}
		});

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float scale) {
		super.render(entity, f, f1, f2, f3, f4, scale);
		setRotationAngles(f, f1, f2, f3, f4, scale, entity);

	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
	}

}
