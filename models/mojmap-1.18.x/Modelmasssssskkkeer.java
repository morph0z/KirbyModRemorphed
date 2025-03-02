// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmasssssskkkeer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "masssssskkkeer"), "main");
	private final ModelPart Head;

	public Modelmasssssskkkeer(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = Head.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 55)
						.addBox(3.0F, -7.0F, -6.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 58)
						.addBox(2.0F, -4.0F, -6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 53)
						.addBox(-2.0F, -4.0F, -7.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(39, 45)
						.addBox(-2.0F, -2.0F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 34)
						.addBox(-4.0F, -7.0F, -6.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-3.0F, -4.0F, -6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(51, 7)
						.addBox(3.0F, -18.5F, -11.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 36)
						.addBox(-4.0F, -19.5F, -10.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 12)
						.addBox(-4.0F, -18.5F, -11.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(3.0F, -19.5F, -10.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(39, 48).addBox(16.75F, 1.5F, 7.0F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.5F, -19.25F, -15.0F, -0.6375F, -0.3863F, 1.608F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(35, 25).addBox(15.5F, -2.5F, 10.25F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.5F, -19.25F, -15.0F, -1.0104F, -0.2892F, 1.4357F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(39, 25).addBox(15.5F, -2.5F, 10.25F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 14.0F, -2.0F, -1.1185F, 0.4892F, -1.8485F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(51, 42).addBox(4.25F, -18.75F, -4.0F, 4.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(39, 7).addBox(-8.25F, -18.75F, -4.0F, 4.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -2.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(55, 0).addBox(5.25F, -20.75F, -4.0F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(33, 16).addBox(-7.25F, -20.75F, -4.0F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, -2.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(57, 46)
						.addBox(-0.5F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 17)
						.addBox(-1.0F, -24.0F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, -2.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(46, 54).addBox(16.75F, 1.5F, 7.0F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 14.0F, -2.0F, -0.6089F, 0.3986F, -1.6643F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}