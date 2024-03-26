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
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelpreanimated_ravager<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("extended_silence", "modelpreanimated_ravager"), "main");
	public final ModelPart whole;
	protected final ModelPart lowerBody;
	protected final ModelPart upperBody;
	protected final ModelPart neck;
	protected final ModelPart head;
	protected final ModelPart jaw;
	protected final ModelPart leftLeg;
	protected final ModelPart leftArm;
	protected final ModelPart rightArm;
	protected final ModelPart rightLeg;

	public Modelpreanimated_ravager(ModelPart root) {
		this.whole = root.getChild("whole");
		this.lowerBody = whole.getChild("lower_body");
		this.rightLeg = lowerBody.getChild("right_leg");
		this.leftLeg = lowerBody.getChild("left_leg");
		this.upperBody = whole.getChild("upper_body");
		this.rightArm = upperBody.getChild("right_arm");
		this.leftArm = upperBody.getChild("left_arm");
		this.neck = upperBody.getChild("neck");
		this.head = neck.getChild("head");
		this.jaw = head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition whole = partdefinition.addOrReplaceChild("whole", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 9.5F));
		PartDefinition lower_body = whole.addOrReplaceChild("lower_body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rotation = lower_body.addOrReplaceChild("rotation", CubeListBuilder.create().texOffs(0, 91).addBox(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -6.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition right_leg = lower_body.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(96, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, -12.0F, 11.5F));
		PartDefinition left_leg = lower_body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(8.0F, -12.0F, 11.5F));
		PartDefinition upper_body = whole.addOrReplaceChild("upper_body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rotation2 = upper_body.addOrReplaceChild("rotation2", CubeListBuilder.create().texOffs(0, 55).addBox(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -6.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition right_arm = upper_body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(64, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, -12.0F, -13.0F));
		PartDefinition left_arm = upper_body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(8.0F, -12.0F, -13.0F));
		PartDefinition neck = upper_body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(68, 73).addBox(-5.0F, -5.0F, -18.0F, 10.0F, 10.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -1.5F));
		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, -18.0F));
		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(0, 36).addBox(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 2.0F));
		PartDefinition horns = head.addOrReplaceChild("horns", CubeListBuilder.create().texOffs(74, 55).addBox(-5.0F, -14.0F, -1.0F, 2.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -13.0F, -9.0F, 1.0472F, 0.0F, 0.0F));
		PartDefinition left_horn = horns.addOrReplaceChild("left_horn", CubeListBuilder.create().texOffs(74, 55).mirror().addBox(8.0F, -41.0F, -20.0F, 2.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 27.0F, 19.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public ModelPart root() {
		return this.whole;
	}

	float toDeg = (float) Math.PI / 180F;

	@Override
	public void setupAnim(T e, float f, float f1, float f2, float f3, float f4) {
		this.whole.getAllParts().forEach(ModelPart::resetPose);
		this.head.yRot = f3 * ((float) Math.PI / 180F);
		this.head.xRot = f4 * ((float) Math.PI / 180F);
		if (!this.riding) {
			rightArm.xRot += Mth.sin(f * 0.5f) * -10 * toDeg;
			leftArm.xRot += Mth.sin(f * 0.5f) * 10 * toDeg;
			rightLeg.xRot += Mth.sin(f * 0.5f) * 10 * toDeg;
			leftLeg.xRot += Mth.sin(f * 0.5f) * -10 * toDeg;
		}
		if (e.isShiftKeyDown()) {
			head.y += (float) (Math.random() - 0.5) * 2;
			head.z += (float) (Math.random() - 0.5) * 2;
			jaw.xRot += 1;
		}
		if (this.attackTime > 0) {
			float a = 1 - this.attackTime;
			a = 1 - a * a * a;
			neck.z += Mth.sin(a * (float) Math.PI) * -14;
			jaw.xRot += Mth.sin(this.attackTime * (float) Math.PI);
		}
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		whole.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
