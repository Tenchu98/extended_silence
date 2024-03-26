package net.tanehu.extendedsilence.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.HierarchicalModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelpreanimated_iron_golem<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("extended_silence", "modelpreanimated_iron_golem"), "main");
	public final ModelPart whole;
	protected final ModelPart body;
	protected final ModelPart head;
	protected final ModelPart leftLeg;
	protected final ModelPart leftArm;
	protected final ModelPart rightArm;
	protected final ModelPart rightLeg;

	public Modelpreanimated_iron_golem(ModelPart root) {
		this.whole = root.getChild("whole");
		this.body = this.whole.getChild("body");
		this.head = this.body.getChild("head");
		this.rightLeg = this.whole.getChild("right_leg");
		this.leftLeg = this.whole.getChild("left_leg");
		this.rightArm = this.body.getChild("right_arm");
		this.leftArm = this.body.getChild("left_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition whole = partdefinition.addOrReplaceChild("whole", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = whole.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 40).addBox(-9.0F, -17.0F, -6.0F, 18.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 70).addBox(-4.5F, -5.0F, -3.0F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -16.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 0).addBox(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -15.0F, -2.0F));
		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(60, 21).addBox(-2.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.0F, -15.0F, 0.0F));
		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(60, 58).addBox(-2.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(11.0F, -15.0F, 0.0F));
		PartDefinition right_leg = whole.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(37, 0).addBox(-3.5F, 0.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -16.0F, 0.0F));
		PartDefinition left_leg = whole.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(60, 0).addBox(-2.5F, 0.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -16.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	float toDeg = ((float) Math.PI / 180F);

	@Override
	public void setupAnim(T e, float f, float f1, float f2, float f3, float f4) {
		this.whole.getAllParts().forEach(ModelPart::resetPose);
		this.head.yRot += f3 * toDeg;
		this.head.xRot += f4 * toDeg;
		if (this.riding) {
			this.whole.y += 13;
			this.rightArm.xRot += -50 * toDeg;
			this.leftArm.xRot += -50 * toDeg;
			this.rightLeg.xRot += -68 * toDeg;
			this.rightLeg.yRot += 23 * toDeg;
			this.rightLeg.zRot += 9 * toDeg;
			this.leftLeg.xRot += -68 * toDeg;
			this.leftLeg.yRot += -23 * toDeg;
			this.leftLeg.zRot += -9 * toDeg;
		} else {
			this.whole.zRot += Mth.cos(f * 0.5f) * f1 * 5 * toDeg;
			this.rightArm.xRot += Mth.sin(f * 0.5f) * f1 * 30 * toDeg;
			this.leftArm.xRot += Mth.sin(f * 0.5f) * f1 * -30 * toDeg;
			this.rightLeg.xRot += Mth.sin(f * 0.5f) * f1 * -30 * toDeg;
			this.leftLeg.xRot += Mth.sin(f * 0.5f) * f1 * 30 * toDeg;
		}
		if (this.attackTime > 0) {
			float a = 1 - this.attackTime * this.attackTime * this.attackTime;
			this.rightArm.xRot *= 1 - Mth.sin(a * (float) Math.PI);
			this.rightArm.xRot += -Mth.sin(a * (float) Math.PI) * 2.5f;
			this.leftArm.xRot *= 1 - Mth.sin(a * (float) Math.PI);
			this.leftArm.xRot += -Mth.sin(a * (float) Math.PI) * 2.5f;
		}
	}

	public ModelPart root() {
		return this.whole;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root().render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
