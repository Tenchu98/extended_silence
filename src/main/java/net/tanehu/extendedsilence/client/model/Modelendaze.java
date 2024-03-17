package net.tanehu.extendedsilence.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelendaze<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("extended_silence", "modelendaze"), "main");
	public final ModelPart upperBodyParts0;
	public final ModelPart upperBodyParts1;
	public final ModelPart upperBodyParts2;
	public final ModelPart upperBodyParts3;
	public final ModelPart upperBodyParts4;
	public final ModelPart upperBodyParts5;
	public final ModelPart upperBodyParts6;
	public final ModelPart upperBodyParts7;
	public final ModelPart upperBodyParts8;
	public final ModelPart upperBodyParts9;
	public final ModelPart upperBodyParts10;
	public final ModelPart upperBodyParts11;
	public final ModelPart head;

	public Modelendaze(ModelPart root) {
		this.upperBodyParts0 = root.getChild("upperBodyParts0");
		this.upperBodyParts1 = root.getChild("upperBodyParts1");
		this.upperBodyParts2 = root.getChild("upperBodyParts2");
		this.upperBodyParts3 = root.getChild("upperBodyParts3");
		this.upperBodyParts4 = root.getChild("upperBodyParts4");
		this.upperBodyParts5 = root.getChild("upperBodyParts5");
		this.upperBodyParts6 = root.getChild("upperBodyParts6");
		this.upperBodyParts7 = root.getChild("upperBodyParts7");
		this.upperBodyParts8 = root.getChild("upperBodyParts8");
		this.upperBodyParts9 = root.getChild("upperBodyParts9");
		this.upperBodyParts10 = root.getChild("upperBodyParts10");
		this.upperBodyParts11 = root.getChild("upperBodyParts11");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition upperBodyParts0 = partdefinition.addOrReplaceChild("upperBodyParts0", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, 4.0F, -11.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition upperBodyParts1 = partdefinition.addOrReplaceChild("upperBodyParts1", CubeListBuilder.create().texOffs(0, 16).addBox(-7.0F, 11.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition upperBodyParts2 = partdefinition.addOrReplaceChild("upperBodyParts2", CubeListBuilder.create().texOffs(0, 16).addBox(9.0F, 12.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition upperBodyParts3 = partdefinition.addOrReplaceChild("upperBodyParts3", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 13.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition upperBodyParts4 = partdefinition.addOrReplaceChild("upperBodyParts4", CubeListBuilder.create().texOffs(0, 16).addBox(7.0F, 13.0F, -7.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition upperBodyParts5 = partdefinition.addOrReplaceChild("upperBodyParts5", CubeListBuilder.create().texOffs(0, 16).addBox(-6.0F, 12.0F, -8.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition upperBodyParts6 = partdefinition.addOrReplaceChild("upperBodyParts6", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, 12.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition upperBodyParts7 = partdefinition.addOrReplaceChild("upperBodyParts7", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, 13.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition upperBodyParts8 = partdefinition.addOrReplaceChild("upperBodyParts8", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, 12.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition upperBodyParts9 = partdefinition.addOrReplaceChild("upperBodyParts9", CubeListBuilder.create().texOffs(0, 16).addBox(-8.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition upperBodyParts10 = partdefinition.addOrReplaceChild("upperBodyParts10", CubeListBuilder.create().texOffs(0, 16).addBox(9.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition upperBodyParts11 = partdefinition.addOrReplaceChild("upperBodyParts11", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, 5.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		upperBodyParts0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		upperBodyParts1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		upperBodyParts2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		upperBodyParts3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		upperBodyParts4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		upperBodyParts5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		upperBodyParts6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		upperBodyParts7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		upperBodyParts8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		upperBodyParts9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		upperBodyParts10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		upperBodyParts11.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.upperBodyParts10.yRot = ageInTicks / 20.f;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.upperBodyParts3.yRot = ageInTicks / 20.f;
		this.upperBodyParts2.yRot = ageInTicks / 20.f;
		this.upperBodyParts1.yRot = ageInTicks / 20.f;
		this.upperBodyParts0.yRot = ageInTicks / 20.f;
		this.upperBodyParts11.yRot = ageInTicks / 20.f;
		this.upperBodyParts7.yRot = ageInTicks / 20.f;
		this.upperBodyParts6.yRot = ageInTicks / 20.f;
		this.upperBodyParts5.yRot = ageInTicks / 20.f;
		this.upperBodyParts4.yRot = ageInTicks / 20.f;
		this.upperBodyParts9.yRot = ageInTicks / 20.f;
		this.upperBodyParts8.yRot = ageInTicks / 20.f;
	}
}
